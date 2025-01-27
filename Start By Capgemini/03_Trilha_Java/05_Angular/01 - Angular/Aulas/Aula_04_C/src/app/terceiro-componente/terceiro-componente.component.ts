import { Component } from '@angular/core';
import { MultiplicaPorPipe } from '../multiplica-por.pipe';

@Component({
  selector: 'app-terceiro-componente',
  imports: [MultiplicaPorPipe],
  templateUrl: './terceiro-componente.component.html',
  styleUrl: './terceiro-componente.component.css'
})
export class TerceiroComponenteComponent {

  numero: number = 5;
}
