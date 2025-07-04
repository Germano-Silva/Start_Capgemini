import { ActivatedRoute } from '@angular/router';
import { ProdutosService } from './../../produtos.service';
import { IProduto, produtos } from './../produtos';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-detalhes-produto',
  templateUrl: './detalhes-produto.component.html',
  styleUrls: ['./detalhes-produto.component.css']
})
export class DetalhesProdutoComponent implements OnInit {
  produto: IProduto | undefined;
  quantidade = 1;

  constructor(
    private ProdutosService: ProdutosService,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const produtoId = Number(params.get("id"));
      this.produto = this.ProdutosService.getOne(produtoId);
    });
  }

}
