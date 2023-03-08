import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { OdontologoService } from '../services/odontologo.service';

@Component({
  selector: 'app-odontologo',
  templateUrl: './odontologo.component.html',
  styleUrls: ['./odontologo.component.scss']
})
export class OdontologoComponent {

  odontologos$ : Observable<any>;
  nombre: string = "";
  nombreMod: string = "";
  apellido : string = "";
  apellidoMod : string = "";
  matricula : string = "";
  matriculaMod : string = "";
  idMod : number = 0;

  constructor(public service : OdontologoService){
  

    this.odontologos$ = service.getOdontologos();


  }

  crearOdontologo(){
    let newOdontologo = {
      nombre : this.nombre,
      apellido : this.apellido,
      matricula : this.matricula
    }
    this.service.createOdontologo(newOdontologo)
    .subscribe((data)=>{
      console.log(data)
    })
  }
  
  seleccionarOdontologo(odontologo : any){

    this.nombreMod = odontologo.nombre;
    this.apellidoMod = odontologo.apellido;
    this.matriculaMod = odontologo.matricula;
    this.idMod = odontologo.id;
  }

  modifyOdontologo(){

    console.log("nombre", this.nombreMod)
    console.log("apellido", this.apellidoMod)
    console.log("matricula", this.matriculaMod)
    this.service.modifyOdontologo({ id : this.idMod, nombre: this.nombreMod, apellido: this.apellidoMod, matricula : this.matriculaMod})
    .subscribe((data)=>{
      console.log(data);
    })

  }


  eliminarOdontologo(id : number){
    
    this.service.deleteOdontologo(id)
    .subscribe((data)=>{
      console.log(data);
    })

  }
  

}
