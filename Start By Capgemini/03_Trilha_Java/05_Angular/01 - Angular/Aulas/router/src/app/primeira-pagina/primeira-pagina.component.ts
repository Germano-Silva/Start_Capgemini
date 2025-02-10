import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-primeira-pagina',
  imports: [],
  templateUrl: './primeira-pagina.component.html',
  styleUrl: './primeira-pagina.component.css'
})
export class PrimeiraPaginaComponent {
  constructor(private router: Router) { }

  moverParaSegundaPagina() {
    this.router.navigate(['/segunda-pagina']);
  }
}
