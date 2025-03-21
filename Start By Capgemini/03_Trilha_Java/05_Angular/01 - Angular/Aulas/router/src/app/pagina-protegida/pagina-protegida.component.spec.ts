import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginaProtegidaComponent } from './pagina-protegida.component';

describe('PaginaProtegidaComponent', () => {
  let component: PaginaProtegidaComponent;
  let fixture: ComponentFixture<PaginaProtegidaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PaginaProtegidaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PaginaProtegidaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
