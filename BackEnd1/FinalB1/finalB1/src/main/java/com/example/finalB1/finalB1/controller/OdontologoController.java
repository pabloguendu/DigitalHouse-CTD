package com.example.finalB1.finalB1.controller;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.service.ServiceOdontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/odontologos")
public class OdontologoController {

    @Autowired
    private ServiceOdontologo serviceOdontologo;

    @GetMapping
    public List<Odontologo> odontologolist() {
        return serviceOdontologo.listaOdontologos();
    }

    @PostMapping
    public ResponseEntity<Odontologo> odontologoNew(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(serviceOdontologo.agregar(odontologo));
    }
    public Optional<Odontologo> search(Long id){
        return serviceOdontologo.buscar(id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        serviceOdontologo.borrar(id);
    }
    @PutMapping
    public ResponseEntity<Odontologo> updateOdontologo(@RequestBody Odontologo o){
        return ResponseEntity.ok(serviceOdontologo.update(o));
    }







}
