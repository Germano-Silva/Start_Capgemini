import { Injectable } from '@angular/core';
import { Disciplina } from '../models/disciplina.model';

@Injectable({
  providedIn: 'root'
})
export class DisciplinaService {
  private disciplinas: Disciplina[] = [
    { id: 1, nome: 'Matemática', cargaHoraria: 80 },
    { id: 2, nome: 'Português', cargaHoraria: 60 }
  ];

  getDisciplinas(): Disciplina[] {
    return this.disciplinas;
  }

  getDisciplinaById(id: number): Disciplina | undefined {
    return this.disciplinas.find(d => d.id === id);
  }

  addDisciplina(disciplina: Disciplina): void {
    this.disciplinas.push(disciplina);
  }

  deleteDisciplina(id: number): boolean {
    const index = this.disciplinas.findIndex(d => d.id === id);
    if (index !== -1) {
      this.disciplinas.splice(index, 1);
      return true;
    }
    return false;
  }
}
