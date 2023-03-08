import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OdontologoService {

  url : string = `http://localhost:8080/api/odontologos/`;

  constructor(private http : HttpClient) {}


  getOdontologos(){
    return this.http.get(this.url);
  }

  createOdontologo(odontologo : any){
    return this.http.post(this.url, odontologo);
  }

  modifyOdontologo(odontologo : any){
    return this.http.put(this.url, odontologo);
  }

  deleteOdontologo(id : number){
    return this.http.delete(this.url + id);
  }
}