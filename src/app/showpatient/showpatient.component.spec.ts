import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ShowpatientComponent } from './showpatient.component';

describe('ShowpatientComponent', () => {
  let component: ShowpatientComponent;
  let fixture: ComponentFixture<ShowpatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientTestingModule],
      declarations: [ ShowpatientComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowpatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

});