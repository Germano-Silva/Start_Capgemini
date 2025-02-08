import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ComponentePaiComponent } from './componente-pai/componente-pai.component';
import { Servico01Component } from './servico-01/servico-01.component';
import { Servico02Component } from './servico-02/servico-02.component';
import { CardComponent } from "./card/card.component";

@Component({
  selector: 'app-root',
  imports: [Servico02Component, Servico01Component, ComponentePaiComponent, CardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_K';
}
