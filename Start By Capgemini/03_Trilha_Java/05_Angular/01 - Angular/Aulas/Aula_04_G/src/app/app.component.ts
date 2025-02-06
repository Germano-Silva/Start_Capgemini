import { Component } from '@angular/core';
import { ComponentePersonalizadoComponent } from "./componente-personalizado/componente-personalizado.component";


@Component({
  selector: 'app-root',
  imports: [ComponentePersonalizadoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_G';
}
