import { Component } from '@angular/core';
import { ComponenteFilhoComponent } from "../componente-filho/componente-filho.component";

@Component({
  selector: 'app-componente-pai',
  imports: [ComponenteFilhoComponent],
  templateUrl: './componente-pai.component.html',
  styleUrl: './componente-pai.component.css'
})
export class ComponentePaiComponent {
  sobrenome: string = 'da Silva';

  mostraNomeCompleto(nomeCompleto: any) {
    alert(`Nome Completo: ${nomeCompleto}`);
  }
}
