import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Servico02Component } from './servico-02.component';

describe('Servico02Component', () => {
  let component: Servico02Component;
  let fixture: ComponentFixture<Servico02Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Servico02Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Servico02Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
