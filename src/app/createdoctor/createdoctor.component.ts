import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms'
import { ApiService } from '../Shared/api.service';
import { CreateDoctorModel } from './createdoctor.model';

@Component({
  selector: 'app-createdoctor',
  templateUrl: './createdoctor.component.html',
  styleUrls: ['./createdoctor.component.css']
})

export class CreatedoctorComponent implements OnInit {

  createdoctorobj : CreateDoctorModel=new CreateDoctorModel();
  formValue!: FormGroup
  constructor(private formbuilder: FormBuilder , private api: ApiService) { }

  ngOnInit(): void {
    this.formValue=this.formbuilder.group({
      name :[''],
      age : [''],
      gender : [''],
      specialist :['']
    })
  }
  
  postDoctorDetails(){
    this.createdoctorobj.docName=this.formValue.value.name;
    this.createdoctorobj.docAge=this.formValue.value.age;
    this.createdoctorobj.docGender=this.formValue.value.gender;
    this.createdoctorobj.docSpecialization=this.formValue.value.specialist;

    this.api.postDoctor(this.createdoctorobj).subscribe(res=>{
      console.log(res);
      alert("Doctor added");
      this.formValue.reset();
    },
    err=>{
      alert("Not added")
      
    })
  }
}
