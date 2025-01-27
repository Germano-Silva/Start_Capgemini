import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeiroComponenteComponent } from './primeiro-componente.component';

describe('PrimeiroComponenteComponent', () => {
  let component: PrimeiroComponenteComponent;
  let fixture: ComponentFixture<PrimeiroComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrimeiroComponenteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimeiroComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
