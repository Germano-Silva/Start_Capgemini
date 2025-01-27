import { Component } from '@angular/core';
import { SegundoComponenteComponent } from './segundo-componente/segundo-componente.component';
import { TerceiroComponenteComponent } from './terceiro-componente/terceiro-componente.component';


@Component({
  selector: 'app-root',
  imports: [SegundoComponenteComponent, TerceiroComponenteComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_C';
}
