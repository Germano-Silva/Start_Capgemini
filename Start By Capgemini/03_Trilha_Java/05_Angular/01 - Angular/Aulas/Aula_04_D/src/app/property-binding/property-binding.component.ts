import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  imports: [],
  templateUrl: './property-binding.component.html',
  styleUrl: './property-binding.component.css'
})

export class PropertyBindingComponent {
  dataNascimento: string = '20-05-1993';
  url: string = '/Aulas/Aula_04_D/src/assets/images/img.jpeg';

  mostrarDataNascimento(){
    alert("A data de nascimento é: " + this.dataNascimento);
  }
}
