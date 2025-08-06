import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/models/aluno.model';
import { Disciplina } from 'src/app/models/disciplina.model';
import { Nota } from 'src/app/models/nota.model';
import { AlunoService } from 'src/app/services/aluno.service';
import { DisciplinaService } from 'src/app/services/disciplina.service';
import { NotaService } from 'src/app/services/nota.service';

@Component({
  selector: 'app-notas',
  templateUrl: './notas.component.html',
  styleUrls: ['./notas.component.css']
})
export class NotasComponent implements OnInit {

  alunos: Aluno[] = [];
  disciplinas: Disciplina[] = [];
  notas: Nota[] = [];
  novaNota: Nota = { id: 0, alunoId: 0, disciplinaId: 0, valor: 0, bimestre: 1 };
  alunoSelecionadoId: number = 0;

  constructor(
    private notaService: NotaService,
    private alunoService: AlunoService,
    private disciplinaService: DisciplinaService
  ) { }

  ngOnInit(): void {
    this.alunos = this.alunoService.getAlunos();
    this.disciplinas = this.disciplinaService.getDisciplinas();
    this.notas = this.notaService.getNotas();
  }

  adicionarNota(): void {
    if (this.novaNota.alunoId > 0 && this.novaNota.disciplinaId > 0) {
      this.novaNota.id = this.notas.length + 1;
      // Garantir que os valores são números
      this.novaNota.alunoId = +this.novaNota.alunoId;
      this.novaNota.disciplinaId = +this.novaNota.disciplinaId;
      this.novaNota.bimestre = +this.novaNota.bimestre;
      this.novaNota.valor = +this.novaNota.valor;

      this.notaService.addNota(this.novaNota);
      this.novaNota = { id: 0, alunoId: this.novaNota.alunoId, disciplinaId: 0, valor: 0, bimestre: 1 };
      this.notas = this.notaService.getNotas();
      alert('Nota lançada com sucesso!');
    } else {
      alert('Por favor, selecione um aluno e uma disciplina!');
    }
  }

  getNotasAluno(): Nota[] {
    return this.notaService.getNotasByAluno(this.alunoSelecionadoId);
  }

  getNomeAluno(id: number): string {
    const aluno = this.alunoService.getAlunoById(id);
    return aluno ? aluno.nome : '';
  }

  getNomeDisciplina(id: number): string {
    const disciplina = this.disciplinaService.getDisciplinaById(id);
    return disciplina ? disciplina.nome : '';
  }

}
