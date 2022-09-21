import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';

import { CreatepatientComponent } from './createpatient.component';

describe('CreatepatientComponent', () => {
  let component: CreatepatientComponent;
  let fixture: ComponentFixture<CreatepatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientTestingModule,ReactiveFormsModule],
      declarations: [ CreatepatientComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatepatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});