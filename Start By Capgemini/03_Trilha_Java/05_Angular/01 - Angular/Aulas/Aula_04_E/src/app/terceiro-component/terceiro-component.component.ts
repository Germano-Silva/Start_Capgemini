import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-terceiro-component',
  imports: [FormsModule],
  templateUrl: './terceiro-component.component.html',
  styleUrl: './terceiro-component.component.css'
})
export class TerceiroComponentComponent {
  name = "";
}
