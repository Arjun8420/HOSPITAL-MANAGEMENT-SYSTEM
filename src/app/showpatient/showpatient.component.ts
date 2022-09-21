import { Component, OnInit } from '@angular/core';
import { PatientService } from '../patient.service';
import { ApiService } from '../Shared/api.service';

@Component({
  selector: 'app-showpatient',
  templateUrl: './showpatient.component.html',
  styleUrls: ['./showpatient.component.css']
})

export class ShowpatientComponent implements OnInit {
  doctorName=[]
  patients:any;
  docId=0;
  patient=[]
  patid:number;  
  name=""
  age:number;

  newName=''
  constructor(private patientService :PatientService,private apiService:ApiService) { }

  ngOnInit(): void {
   
  }

  getdoc(docId){
    return this.apiService.getDoctor(docId).subscribe(data=>{
      console.log("data",data)

      this.doctorName.push(data["docName"]);
    });
  }


   getData(){
     this.patient=[]
   return this.patientService.getPateint(this.patid).subscribe(async(data)=>{
      console.log("LIst of patient",data)
      this.name=data["name"]
      this.age=data["age"];
      this.patients=data["listOfVisit"];
      this.patient=this.patients;
      
      for(let i of data["listOfVisit"]){
        this.docId = i['visdoc']
        this.getdoc(this.docId);
      }

      this.patient=this.patients;
    },err=>{
      alert("Please enter valid patient ID")
    })
    
  }
}
