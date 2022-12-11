package com.example.finalB1.finalB1.controller;
import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/odontologos")
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public Set<OdontologoDto> odontologoList() {
        return odontologoService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> odontologoNew(@RequestBody OdontologoDto odontologoDto) {
        odontologoService.crearOdontologo(odontologoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    public OdontologoDto search(Long id){
        return odontologoService.buscarOdontologo(id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        odontologoService.eliminarOdontologo(id);
    }
    @PutMapping
    public ResponseEntity<?> updateOdontologo(@RequestBody OdontologoDto o){
        odontologoService.modificarOdontologo(o);
        return ResponseEntity.ok(HttpStatus.OK);
    }







}
