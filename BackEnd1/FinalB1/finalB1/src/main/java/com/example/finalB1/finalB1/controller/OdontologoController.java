package com.example.finalB1.finalB1.controller;
import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.service.IOdontologoService;
import com.example.finalB1.finalB1.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
=======
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/odontologos")
public class OdontologoController {

    @Autowired
    private IOdontologoService odontologoService;

    @GetMapping
<<<<<<< HEAD
    public Set<OdontologoDto> odontologoList() {
=======
    public List<OdontologoDto> odontologolist() {
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747
        return odontologoService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> odontologoNew(@RequestBody OdontologoDto odontologoDto) {
        odontologoService.crearOdontologo(odontologoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
<<<<<<< HEAD
    public OdontologoDto search(Long id){
        return odontologoService.buscarOdontologo(id);
=======
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747

    @GetMapping("/{id}")
    public OdontologoDto search(@PathVariable Long id) {
        return odontologoService.buscarOdontologo(id);
    }
<<<<<<< HEAD
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        odontologoService.eliminarOdontologo(id);
    }
    @PutMapping
    public ResponseEntity<?> updateOdontologo(@RequestBody OdontologoDto o){
        odontologoService.modificarOdontologo(o);
=======

    @PutMapping
    public ResponseEntity<?> update(@RequestBody OdontologoDto odontologoDto) {
        odontologoService.modificarOdontologo(odontologoDto);
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}


