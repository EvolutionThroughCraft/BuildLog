import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SentinelsComponent } from './sentinels.component';

describe('SentinelsComponent', () => {
  let component: SentinelsComponent;
  let fixture: ComponentFixture<SentinelsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SentinelsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SentinelsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
