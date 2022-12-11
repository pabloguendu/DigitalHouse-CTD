import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { OdontologoComponent } from './odontologo/odontologo.component';
import { FormsModule } from '@angular/forms';
import { TurnoComponent } from './turno/turno.component';
import { PacienteComponent } from './paciente/paciente.component';

@NgModule({
  declarations: [
    AppComponent,
    OdontologoComponent,
    TurnoComponent,
    PacienteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
