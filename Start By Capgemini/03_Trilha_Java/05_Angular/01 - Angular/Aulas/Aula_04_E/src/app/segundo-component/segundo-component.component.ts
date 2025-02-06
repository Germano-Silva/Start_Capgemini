import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MultiplicarPorPipe } from '../multiplicar-por.pipe';

@Component({
  selector: 'app-segundo-component',
  imports: [CommonModule, MultiplicarPorPipe],
  templateUrl: './segundo-component.component.html',
  styleUrl: './segundo-component.component.css'
})
export class SegundoComponentComponent {
  nome = 'Germano';
  dataNascimento = '1993-05-20';
  urlImage = "/assets/1354097.jpeg";

  mostrarDataNascimento() {
    alert("A data de Nascimento do " + this.nome + " é " + this.dataNascimento);
  }
}
