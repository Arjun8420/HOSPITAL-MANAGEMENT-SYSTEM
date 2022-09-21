import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';

import { CreatedoctorComponent } from './createdoctor.component';

describe('CreatedoctorComponent', () => {
  let component: CreatedoctorComponent;
  let fixture: ComponentFixture<CreatedoctorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientTestingModule,ReactiveFormsModule],
      declarations: [ CreatedoctorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatedoctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
