import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { OdontologoService } from '../services/odontologo.service';
import { PacienteService } from '../services/paciente.service';
import { TurnoService } from '../services/turno.service';

@Component({
  selector: 'app-turno',
  templateUrl: './turno.component.html',
  styleUrls: ['./turno.component.scss']
})
export class TurnoComponent {

  
  turnos$ : Observable<any>;
  pacientes$ : Observable<any>;
  odontologos$ : Observable<any>;
  hora: string = "";
  horaMod:string="";
  fecha: string = "";
  fechaMod: string = "";
  idOdontologo:number=0;
  idPaciente:number=0;
  idOdontologoMod:number=0;
  idPacienteMod:number=0;
  idMod : number = 0;
  odontologoSeleccionado:any;
  pacienteSeleccionado:any;
  odontologoSeleccionadoMod:any;
  pacienteSeleccionadoMod:any;

  constructor(public service : TurnoService, private oService : OdontologoService, private pService : PacienteService){
  

    this.turnos$ = service.getTurnos();
    this.odontologos$=oService.getOdontologos();
    this.pacientes$=pService.getPacientes();

  }

  crearTurno(){
    let newTurno = {
      hora : this.hora,
      fecha : this.fecha,
      paciente : {id: this.pacienteSeleccionado},
      odontologo:{id: this.odontologoSeleccionado}
    }
    console.log(newTurno);
    this.service.createTurnos(newTurno)
    .subscribe((data)=>{
      console.log(data)
    })
  }
  
  seleccionarTurno(turno : any){

    this.horaMod = turno.hora;
    this.fechaMod = turno.fecha;
    this.idPacienteMod = turno.paciente.id;
    this.idOdontologoMod = turno.odontologo.id;
    this.idMod = turno.id;
  }

  modifyTurno(){
    let turnoMod={
      hora : this.horaMod,
      fecha : this.fechaMod,
      paciente : {id: this.pacienteSeleccionadoMod},
      odontologo:{id: this.odontologoSeleccionadoMod}
    
    }
    this.service.modifyTurnos(turnoMod)
    .subscribe((data)=>{
      console.log(data);
    })

  }


  eliminarTurno(id : number){
    
    this.service.deleteTurnos(id)
    .subscribe((data)=>{
      console.log(data);
    })

  }

}
