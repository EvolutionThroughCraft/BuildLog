import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SentinalDetailComponent } from './sentinal-detail.component';

describe('SentinalDetailComponent', () => {
  let component: SentinalDetailComponent;
  let fixture: ComponentFixture<SentinalDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SentinalDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SentinalDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
