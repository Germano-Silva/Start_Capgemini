import { Component } from '@angular/core';
import { PrimeiroComponentComponent } from './primeiro-component/primeiro-component.component';
import { SegundoComponentComponent } from './segundo-component/segundo-component.component';
import { TerceiroComponentComponent } from "./terceiro-component/terceiro-component.component";
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-root',
  imports: [PrimeiroComponentComponent, SegundoComponentComponent, TerceiroComponentComponent, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_E';
}
