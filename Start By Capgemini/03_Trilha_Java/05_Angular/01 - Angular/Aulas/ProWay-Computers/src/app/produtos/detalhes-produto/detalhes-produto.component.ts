import { CarrinhoService } from './../../carrinho.service';
import { NotificacaoService } from './../../notificacao.service';
import { ActivatedRoute } from '@angular/router';
import { ProdutosService } from './../../produtos.service';
import { IProduto, IProdutoCarrinho, produtos } from './../produtos';
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
    private route: ActivatedRoute,
    private NotificacaoService: NotificacaoService,
    private CarrinhoService: CarrinhoService
  ) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const produtoId = Number(params.get("id"));
      this.produto = this.ProdutosService.getOne(produtoId);

    });
  }

  AdicionarAoCarrinho() {
    this.NotificacaoService.notificar("O produto foi adicionado ao carrinho!");
    const produto: IProdutoCarrinho = {
      ...this.produto!,
      quantidade: this.quantidade
    }
    this.CarrinhoService.adicionarAoCarrinho(produto);
  }

}
