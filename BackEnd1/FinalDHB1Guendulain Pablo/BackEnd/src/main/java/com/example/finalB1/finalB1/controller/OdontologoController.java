package com.example.finalB1.finalB1.controller;
import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.service.IOdontologoService;
import com.example.finalB1.finalB1.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/odontologos")
public class OdontologoController {

    @Autowired
    private IOdontologoService odontologoService;

    @GetMapping
    public List<OdontologoDto> odontologolist() {
        return odontologoService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> odontologoNew(@RequestBody OdontologoDto odontologoDto) {
        odontologoService.crearOdontologo(odontologoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public OdontologoDto search(@PathVariable Long id) {
        return odontologoService.buscarOdontologo(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping()
    public ResponseEntity<?> update(@RequestBody OdontologoDto odontologoDto) {
        odontologoService.modificarOdontologo(odontologoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}


