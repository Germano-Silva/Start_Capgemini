import { LoggerService } from './../logger.service';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-servico-01',
  imports: [FormsModule],
  templateUrl: './servico-01.component.html',
  styleUrl: './servico-01.component.css'
})
export class Servico01Component {
  nome = "";

  constructor(private logger: LoggerService) {
  }

  adicionarNome() {
    console.log("O nome " + this.nome + " foi adicionado");
    this.logger.logar("O nome " + this.nome + " foi adicionado a lista");
  }
}
