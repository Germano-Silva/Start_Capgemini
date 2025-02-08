import { DatePipe } from '@angular/common';
import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-ciclo-de-vida',
  imports: [DatePipe],
  templateUrl: './ciclo-de-vida.component.html',
  styleUrl: './ciclo-de-vida.component.css'
})

export class CicloDeVidaComponent implements OnChanges {
  horario: Date = new Date();
  timer: any = null!;
  @Input() texto = " ";

  ngOnInit(): void {
    this.timer = setInterval(() => this.horario = new Date(), 1000);
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes);
  }

  ngOnDestroy(): void {
    clearInterval(this.timer);
    console.log("ngOnDestroy foi chamado!");
  }
}
