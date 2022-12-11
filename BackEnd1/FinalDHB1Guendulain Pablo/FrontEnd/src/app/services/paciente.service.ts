import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  url : string = `http://localhost:8080/api/pacientes`;

  constructor(private http : HttpClient) {}


  getPacientes(){
    return this.http.get(this.url);
  }

  createPacientes(pacientes : any){
    return this.http.post(this.url, pacientes);
  }

  modifyPacientes(pacientes : any){
    return this.http.put(this.url, pacientes);
  }

  deletePacientes(id : number){
    return this.http.delete(this.url+"/" + id);
  }
}
