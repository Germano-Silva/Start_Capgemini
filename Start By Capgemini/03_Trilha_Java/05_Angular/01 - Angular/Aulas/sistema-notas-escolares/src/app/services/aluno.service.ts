import { Injectable } from '@angular/core';
import { Aluno } from '../models/aluno.model';

@Injectable({
  providedIn: 'root'
})

export class AlunoService {
  private alunos: Aluno[] = [
    { id: 1, nome: 'João Silva', matricula: '2023001', turma: '3A' },
    { id: 2, nome: 'Maria Souza', matricula: '2023002', turma: '3A' }
  ];

  getAlunos(): Aluno[] {
    return this.alunos;
  }

  getAlunoById(id: number): Aluno | undefined {
    return this.alunos.find(a => a.id === id);
  }

  addAluno(aluno: Aluno): void {
    this.alunos.push(aluno);
  }

  deleteAluno(id: number): boolean {
    const index = this.alunos.findIndex(a => a.id === id);
    if (index !== -1) {
      this.alunos.splice(index, 1);
      return true;
    }
    return false;
  }
}
