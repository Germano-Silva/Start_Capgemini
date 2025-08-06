import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/models/aluno.model';
import { AlunoService } from 'src/app/services/aluno.service';

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.css']
})
export class AlunosComponent implements OnInit {

  alunos: Aluno[] = [];
  novoAluno: Aluno = { id: 0, nome: '', matricula: '', turma: '' };

  constructor(private alunoService: AlunoService) { }

  ngOnInit(): void {
    this.alunos = this.alunoService.getAlunos();
  }

  adicionarAluno(): void {
    this.novoAluno.id = this.alunos.length + 1;
    this.alunoService.addAluno(this.novoAluno);
    this.novoAluno = { id: 0, nome: '', matricula: '', turma: '' };
    this.alunos = this.alunoService.getAlunos();
  }

  excluirAluno(id: number): void {
    if (confirm('Tem certeza que deseja excluir este aluno?')) {
      const sucesso = this.alunoService.deleteAluno(id);
      if (sucesso) {
        this.alunos = this.alunoService.getAlunos();
        alert('Aluno excluído com sucesso!');
      } else {
        alert('Erro ao excluir aluno!');
      }
    }
  }

}
