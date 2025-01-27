import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  imports: [],
  templateUrl: './segundo-componente.component.html',
  styleUrl: './segundo-componente.component.css'
})
export class SegundoComponenteComponent {
  nome: string = 'Germano'
}
