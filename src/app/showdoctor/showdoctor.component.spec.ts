import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowdoctorComponent } from './showdoctor.component';

describe('ShowdoctorComponent', () => {
  let component: ShowdoctorComponent;
  let fixture: ComponentFixture<ShowdoctorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientTestingModule],
      declarations: [ ShowdoctorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowdoctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});