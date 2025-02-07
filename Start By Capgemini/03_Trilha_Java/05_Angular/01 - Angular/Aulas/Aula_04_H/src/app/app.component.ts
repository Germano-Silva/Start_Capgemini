import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ComponentePaiComponent } from "./componente-pai/componente-pai.component";
import { ComponenteFilhoComponent } from "./componente-filho/componente-filho.component";

@Component({
  selector: 'app-root',
  imports: [ComponentePaiComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_H';
}
