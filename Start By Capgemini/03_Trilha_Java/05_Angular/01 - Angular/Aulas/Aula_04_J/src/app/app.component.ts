import { Component } from '@angular/core';
import { CicloDeVidaPaiComponent } from "./ciclo-de-vida-pai/ciclo-de-vida-pai.component";


@Component({
  selector: 'app-root',
  imports: [CicloDeVidaPaiComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_J';
}
