package com.example.finalB1.finalB1.controller;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/odontologos")
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public List<Odontologo> odontologolist() {
        return odontologoService.listaOdontologos();
    }

    @PostMapping
    public ResponseEntity<Odontologo> odontologoNew(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.agregar(odontologo));
    }
    public Optional<Odontologo> search(Long id){
        return odontologoService.buscar(id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        odontologoService.borrar(id);
    }
    @PutMapping
    public ResponseEntity<Odontologo> updateOdontologo(@RequestBody Odontologo o){
        return ResponseEntity.ok(odontologoService.update(o));
    }







}
