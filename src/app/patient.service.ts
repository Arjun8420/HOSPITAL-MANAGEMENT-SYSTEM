import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor(private httpClient:HttpClient) { }

  getPateint(id:number){
    return this.httpClient.get(`http://localhost:8055/patient/${id}/visit`)
  }
}
