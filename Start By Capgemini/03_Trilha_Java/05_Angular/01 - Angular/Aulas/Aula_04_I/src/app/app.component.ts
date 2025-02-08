import { Component } from '@angular/core';
import { Servico01Component } from "./servico-01/servico-01.component";
import { Servico02Component } from "./servico-02/servico-02.component";

@Component({
  selector: 'app-root',
  imports: [Servico01Component, Servico02Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_I';
}
