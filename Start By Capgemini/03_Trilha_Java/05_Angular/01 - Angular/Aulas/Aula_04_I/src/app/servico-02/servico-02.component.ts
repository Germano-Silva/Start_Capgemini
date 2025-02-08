import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-servico-02',
  imports: [FormsModule],
  templateUrl: './servico-02.component.html',
  styleUrl: './servico-02.component.css'
})
export class Servico02Component {
  descricao = "";

  constructor(public logger: LoggerService) { }

  adicionarDescricao() {
    console.log("A Descrição: " + this.descricao + " - foi adicionado");
    this.logger.logar("A Descrição " + this.descricao + " foi adicionado a lista");
  }
}
