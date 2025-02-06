import { Component } from '@angular/core';
import { Celular } from './celular.interface';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-quarto-component',
  imports: [CommonModule],
  templateUrl: './quarto-component.component.html',
  styleUrl: './quarto-component.component.css'
})
export class QuartoComponentComponent {
  // Declarando como uma propriedade da classe, não como const
  celulares: Celular[] = [
    { id: 1, nome: 'Samsung Galaxy S23', descricao: 'Smartphone topo de linha com tela de 6,1 polegadas e processador Snapdragon 8 Gen 2.', esgotado: false },
    { id: 2, nome: 'iPhone 15 Pro', descricao: 'Com câmera de 48 MP e chip A17 Pro, oferece desempenho e design premium.', esgotado: true },
    { id: 3, nome: 'Xiaomi Redmi Note 12', descricao: 'Celular de entrada com boa performance, tela AMOLED de 6,67 polegadas e bateria de 5000mAh.', esgotado: false },
    { id: 4, nome: 'Motorola Edge 40', descricao: 'Smartphone com display OLED de 6,55 polegadas e processador Dimensity 8020.', esgotado: false },
    { id: 5, nome: 'OnePlus 11', descricao: 'Smartphone com tela Fluid AMOLED de 6,7 polegadas e processador Snapdragon 8 Gen 2.', esgotado: true },
    { id: 6, nome: 'Realme 11 Pro', descricao: 'Celular intermediário com câmera principal de 100 MP e tela curva de 6,7 polegadas.', esgotado: false },
    { id: 7, nome: 'Oppo Find X6 Pro', descricao: 'Smartphone de alta performance com câmera de 50 MP e processador Snapdragon 8 Gen 2.', esgotado: false },
    { id: 8, nome: 'Sony Xperia 1 IV', descricao: 'Focado em fotografia e vídeo, com câmera de 48 MP e display 4K OLED de 6,5 polegadas.', esgotado: true },
  ];

}
