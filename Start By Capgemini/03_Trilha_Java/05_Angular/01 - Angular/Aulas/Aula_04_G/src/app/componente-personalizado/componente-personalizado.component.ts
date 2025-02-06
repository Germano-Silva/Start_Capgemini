import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-componente-personalizado',
  imports: [],
  templateUrl: './componente-personalizado.component.html',
  styleUrl: './componente-personalizado.component.css'
})
export class ComponentePersonalizadoComponent {
  @Input() nome: string = '';
  @Input() sobrenome: string = '';
}
