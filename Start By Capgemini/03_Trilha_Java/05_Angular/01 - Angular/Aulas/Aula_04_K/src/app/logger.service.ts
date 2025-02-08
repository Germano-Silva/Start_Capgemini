import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {
  mensagems: string[] = [];

  logar(mensagem: string) {
    console.log(mensagem);
    this.mensagems.push(mensagem)
  }

  exibeLogs() {
    console.log(this.mensagems);
  }

}
