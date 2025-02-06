import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TerceiroComponentComponent } from './terceiro-component.component';

describe('TerceiroComponentComponent', () => {
  let component: TerceiroComponentComponent;
  let fixture: ComponentFixture<TerceiroComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TerceiroComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TerceiroComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
