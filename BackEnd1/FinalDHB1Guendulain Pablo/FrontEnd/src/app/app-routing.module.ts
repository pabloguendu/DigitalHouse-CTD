import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OdontologoComponent } from './odontologo/odontologo.component';
import { PacienteComponent } from './paciente/paciente.component';
import { TurnoComponent } from './turno/turno.component';

const routes: Routes = [
  {
    path:'',
    component:TurnoComponent
  },
  {
    path:'turno',
    component:TurnoComponent
  },
  {
    path:'odontologo',
    component:OdontologoComponent
  },
  {
    path:'paciente',
    component:PacienteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
