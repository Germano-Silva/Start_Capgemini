import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeiroComponentComponent } from './primeiro-component.component';

describe('PrimeiroComponentComponent', () => {
  let component: PrimeiroComponentComponent;
  let fixture: ComponentFixture<PrimeiroComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrimeiroComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimeiroComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
