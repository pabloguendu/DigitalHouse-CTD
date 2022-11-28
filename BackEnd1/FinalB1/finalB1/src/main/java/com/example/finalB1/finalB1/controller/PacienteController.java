package com.example.finalB1.finalB1.controller;

import com.example.finalB1.finalB1.entity.Paciente;
import com.example.finalB1.finalB1.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class PacienteController {
    @Autowired
    private PacienteService servicePaciente;

    @GetMapping
    public List<Paciente> pacienteList() {
        return servicePaciente.listaPacientes();
    }

    @PostMapping
    public ResponseEntity<Paciente> pacienteNew(@RequestBody Paciente paciente){
        return ResponseEntity.ok(servicePaciente.agregar(paciente));
    }
    public Optional<Paciente> search(Long id){
        return servicePaciente.buscar(id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        servicePaciente.borrar(id);
    }
    @PutMapping
    public ResponseEntity<Paciente> updateOdontologo(@RequestBody Paciente p){
        return ResponseEntity.ok(servicePaciente.update(p));
    }
}
