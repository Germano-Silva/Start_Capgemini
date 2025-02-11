import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-pagina-com-parametros',
  imports: [CommonModule],
  templateUrl: './pagina-com-parametros.component.html',
  styleUrl: './pagina-com-parametros.component.css'
})
export class PaginaComParametrosComponent implements OnInit {
  id: number | null = null;
  nome: string = '';
  idade: number | null = null;

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.id = Number(params.get('id'));
    });

    this.route.queryParamMap.subscribe(params => {
      this.nome = params.get('nome') || '';
      this.idade = Number(params.get('idade'));
    });
  }

}
