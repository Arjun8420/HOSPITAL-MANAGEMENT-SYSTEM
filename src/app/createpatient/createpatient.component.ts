import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms'
import { ApiService } from '../Shared/api.service';
import { CreatePatientModel } from './createpatient.model';
import { Doctors } from './doctors.model';

@Component({
  selector: 'app-createpatient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})

export class CreatepatientComponent implements OnInit {

  createdoctorobj : CreatePatientModel=new CreatePatientModel();
  formValue!: FormGroup
  doctors : Array<Doctors>=[];
  selecteddoctor : string='';
  selecteddoctorid !: number | undefined;
  constructor(private formbuilder: FormBuilder , private api: ApiService) { }

  ngOnInit(): void {
    this.formValue=this.formbuilder.group({
      patname :[''],
      patid :[''],
      visiteddoc : [''],
      prescription : [''],
      date :[''],
      age:['']
    })
    this.getAllDoctors();

  }

  changeDoc(){
    const found=this.doctors.find((obj)=>{
      return obj.docName===this.selecteddoctor
    })
    this.selecteddoctorid=found?.docid
  }
  getAllDoctors() {
    this.api.getAllDoctors().subscribe(res => {
      this.doctors = res;
    })

  }
  postPatient(){
    this.createdoctorobj.patname=this.formValue.value.patname;
    this.createdoctorobj.patid=this.formValue.value.patid;
    this.createdoctorobj.docvisited=this.selecteddoctorid
    this.createdoctorobj.date=this.formValue.value.date;
    this.createdoctorobj.prescription=this.formValue.value.prescription;
    this.createdoctorobj.age=this.formValue.value.age;
    this.api.postPatient(this.createdoctorobj).subscribe(res=>{
      console.log(res);
      alert("Patient added");
      this.formValue.reset();
    },
    err=>{
      alert("Not added")
      
    })
  }

}
