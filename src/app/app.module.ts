import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { CreatedoctorComponent } from './createdoctor/createdoctor.component';
import { ShowdoctorComponent } from './showdoctor/showdoctor.component';
import { ShowpatientComponent } from './showpatient/showpatient.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CreatepatientComponent,
    CreatedoctorComponent,
    ShowdoctorComponent,
    ShowpatientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
