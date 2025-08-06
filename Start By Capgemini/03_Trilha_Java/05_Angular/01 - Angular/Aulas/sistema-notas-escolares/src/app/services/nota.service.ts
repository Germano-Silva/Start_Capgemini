import { Injectable } from '@angular/core';
import { Nota } from '../models/nota.model';

@Injectable({
  providedIn: 'root'
})
export class NotaService {
  private notas: Nota[] = [];

  getNotas(): Nota[] {
    return this.notas;
  }

  getNotasByAluno(alunoId: number): Nota[] {
    return this.notas.filter(n => n.alunoId === alunoId);
  }

  addNota(nota: Nota): void {
    this.notas.push(nota);
  }
}
