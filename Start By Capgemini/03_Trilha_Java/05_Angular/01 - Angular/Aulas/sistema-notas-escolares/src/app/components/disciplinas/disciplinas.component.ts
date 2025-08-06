import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/models/aluno.model';
import { Disciplina } from 'src/app/models/disciplina.model';
import { Nota } from 'src/app/models/nota.model';
import { AlunoService } from 'src/app/services/aluno.service';
import { DisciplinaService } from 'src/app/services/disciplina.service';
import { NotaService } from 'src/app/services/nota.service';

interface AlunoMedia {
  aluno: Aluno;
  media: number;
  situacao: string;
}

@Component({
  selector: 'app-disciplinas',
  templateUrl: './disciplinas.component.html',
  styleUrls: ['./disciplinas.component.css']
})
export class DisciplinasComponent implements OnInit {

  disciplinas: Disciplina[] = [];
  disciplinaSelecionada: Disciplina | null = null;
  alunosComMedia: AlunoMedia[] = [];
  novaDisciplina: Disciplina = { id: 0, nome: '', cargaHoraria: 0 };
  mostrarFormulario: boolean = false;

  constructor(
    private disciplinaService: DisciplinaService,
    private alunoService: AlunoService,
    private notaService: NotaService
  ) { }

  ngOnInit(): void {
    this.disciplinas = this.disciplinaService.getDisciplinas();
  }

  selecionarDisciplina(disciplina: Disciplina): void {
    this.disciplinaSelecionada = disciplina;
    this.calcularMediasAlunos();
  }

  calcularMediasAlunos(): void {
    if (!this.disciplinaSelecionada) return;

    const alunos = this.alunoService.getAlunos();
    this.alunosComMedia = [];

    alunos.forEach(aluno => {
      const notasAluno = this.notaService.getNotas().filter(
        nota => nota.alunoId === aluno.id && nota.disciplinaId === this.disciplinaSelecionada!.id
      );

      // Verificar se tem notas dos 4 bimestres
      const bimestresComNota = new Set(notasAluno.map(nota => nota.bimestre));
      const temTodos4Bimestres = bimestresComNota.size === 4 &&
        [1, 2, 3, 4].every(bim => bimestresComNota.has(bim));

      let media = 0;
      let situacao = '';

      if (notasAluno.length === 0) {
        situacao = 'Sem avaliação';
      } else if (!temTodos4Bimestres) {
        situacao = 'Incompleto';
        // Calcular média parcial
        const somaNotas = notasAluno.reduce((soma, nota) => soma + nota.valor, 0);
        media = somaNotas / notasAluno.length;
      } else {
        // Tem todas as 4 notas, calcular média final
        const somaNotas = notasAluno.reduce((soma, nota) => soma + nota.valor, 0);
        media = somaNotas / 4; // Média dos 4 bimestres
        situacao = media >= 7 ? 'Aprovado' : 'Reprovado';
      }

      this.alunosComMedia.push({
        aluno,
        media: Math.round(media * 100) / 100, // Arredondar para 2 casas decimais
        situacao
      });
    });
  }

  getSituacaoClass(situacao: string): string {
    return situacao === 'Aprovado' ? 'text-success' : 'text-danger';
  }

  getAprovados(): number {
    return this.alunosComMedia.filter(item => item.situacao === 'Aprovado').length;
  }

  getReprovados(): number {
    return this.alunosComMedia.filter(item => item.situacao === 'Reprovado').length;
  }

  toggleFormulario(): void {
    this.mostrarFormulario = !this.mostrarFormulario;
    if (!this.mostrarFormulario) {
      this.novaDisciplina = { id: 0, nome: '', cargaHoraria: 0 };
    }
  }

  adicionarDisciplina(): void {
    if (this.novaDisciplina.nome.trim() && this.novaDisciplina.cargaHoraria > 0) {
      this.novaDisciplina.id = this.disciplinas.length > 0 ?
        Math.max(...this.disciplinas.map(d => d.id)) + 1 : 1;

      this.disciplinaService.addDisciplina(this.novaDisciplina);
      this.disciplinas = this.disciplinaService.getDisciplinas();
      this.novaDisciplina = { id: 0, nome: '', cargaHoraria: 0 };
      this.mostrarFormulario = false;
      alert('Disciplina adicionada com sucesso!');
    } else {
      alert('Por favor, preencha todos os campos corretamente!');
    }
  }

  excluirDisciplina(id: number): void {
    if (confirm('Tem certeza que deseja excluir esta disciplina? Todas as notas relacionadas serão perdidas.')) {
      const sucesso = this.disciplinaService.deleteDisciplina(id);
      if (sucesso) {
        this.disciplinas = this.disciplinaService.getDisciplinas();

        // Se a disciplina excluída estava selecionada, limpar seleção
        if (this.disciplinaSelecionada && this.disciplinaSelecionada.id === id) {
          this.disciplinaSelecionada = null;
          this.alunosComMedia = [];
        }

        alert('Disciplina excluída com sucesso!');
      } else {
        alert('Erro ao excluir disciplina!');
      }
    }
  }
}
