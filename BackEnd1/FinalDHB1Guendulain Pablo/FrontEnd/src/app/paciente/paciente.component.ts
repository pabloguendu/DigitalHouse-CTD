import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { PacienteService } from '../services/paciente.service';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.scss']
})
export class PacienteComponent {
  pacientes$ : Observable<any>;
  nombre: string = "";
  nombreMod: string = "";
  apellido : string = "";
  apellidoMod : string = "";
  domicilio : string = "";
  domicilioMod : string = "";
  dni : string = "";
  dniMod : string = "";
  fechaAlta : string = "";
  fechaAltaMod : string = "";
  idMod : number = 0;

  constructor(public service : PacienteService){
  

    this.pacientes$ = service.getPacientes();


  }

  crearPaciente(){
    let newPaciente = {
      nombre : this.nombre,
      apellido : this.apellido,
      domicilio : this.domicilio,
      dni : this.dni,
      fechaAlta : this.fechaAlta
    }
    console.log(newPaciente);
    this.service.createPacientes(newPaciente)
    .subscribe((data)=>{
      console.log(data)
    })
  }
  
  seleccionarPaciente(paciente : any){

    this.nombreMod = paciente.nombre;
    this.apellidoMod = paciente.apellido;
    this.domicilioMod = paciente.domicilio;
    this.dniMod = paciente.dni;
    this.fechaAltaMod = paciente.fechaAlta;
    this.idMod = paciente.id;
  }

  modifyPaciente(){

    this.service.modifyPacientes({ id : this.idMod, nombre: this.nombreMod, apellido: this.apellidoMod, domicilio : this.domicilioMod, dni: this.dniMod, fechaAlta : this.fechaAltaMod})
    .subscribe((data)=>{
      console.log(data);
    })

  }


  eliminarPaciente(id : number){
    
    this.service.deletePacientes(id)
    .subscribe((data)=>{
      console.log(data);
    })

  }

}
