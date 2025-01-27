import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TerceiroComponenteComponent } from './terceiro-componente.component';

describe('TerceiroComponenteComponent', () => {
  let component: TerceiroComponenteComponent;
  let fixture: ComponentFixture<TerceiroComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TerceiroComponenteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TerceiroComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
