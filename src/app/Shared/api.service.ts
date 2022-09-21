import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http'
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class ApiService {

  constructor(private http :HttpClient) { }

  postDoctor(data : any){
    return this.http.post<any>("http://localhost:8053/doctor",data).pipe(map((res:any)=>{
      return res;
    }))
  }

  postPatient(data :any){
    return this.http.post<any>("http://localhost:8055/patient" , data ).pipe(map((res:any)=>{
      return res;
    }))
  }

  getAllDoctors(){
    return this.http.get<any>("http://localhost:8053/doctor").pipe(map((res:any)=>{
      return res;
    }))
  }

  getDoctor(id){
    return this.http.get<any>(`http://localhost:8053/doctor/${id}/`).pipe(map((res:any)=>{
      return res;
    }))
  }
  getDoctorById(id:number){
    return this .http.get<any>("http://localhost:8055/patient/doctors/"+id).pipe(map((res:any)=>{
      return res;
    }))
  }
}