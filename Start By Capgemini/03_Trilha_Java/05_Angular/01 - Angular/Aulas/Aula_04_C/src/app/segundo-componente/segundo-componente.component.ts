import { Component } from '@angular/core';
import { UpperCasePipe, DatePipe } from '@angular/common';

@Component({
  selector: 'app-segundo-componente',
  imports: [UpperCasePipe, DatePipe],
  templateUrl: './segundo-componente.component.html',
  styleUrl: './segundo-componente.component.css'
})
export class SegundoComponenteComponent {
    nome: string = 'Germano';
    idade: number = 30;
    dataNascimento: string = '1993-20-05';
  }
