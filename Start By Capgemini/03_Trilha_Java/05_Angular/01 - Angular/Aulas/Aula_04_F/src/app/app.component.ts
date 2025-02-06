import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { QuartoComponentComponent } from './quarto-component/quarto-component.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [FormsModule, QuartoComponentComponent, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula_04_F';
}
