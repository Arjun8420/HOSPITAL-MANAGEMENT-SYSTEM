import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CreatedoctorComponent } from './createdoctor/createdoctor.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { HeaderComponent } from './header/header.component';
import { ShowdoctorComponent } from './showdoctor/showdoctor.component';
import { ShowpatientComponent } from './showpatient/showpatient.component';

const routes: Routes = [
  {path:'doctor' , component:CreatedoctorComponent},
  {path:'patient' , component:CreatepatientComponent},
  {path:'showdoctor', component:ShowdoctorComponent},
  {path:'showpatient', component:ShowpatientComponent}
];

@NgModule({

  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
