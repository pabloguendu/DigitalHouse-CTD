package com.example.finalB1.finalB1.controller;

import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.entity.Paciente;
import com.example.finalB1.finalB1.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PacienteController {
    @Autowired
    private PacienteService servicePaciente;

    @GetMapping
    public Set<PacienteDto> pacienteList() {
        return servicePaciente.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> pacienteNew(@RequestBody PacienteDto pacienteDto){
        servicePaciente.crearPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    public PacienteDto search(Long id){
        return servicePaciente.buscarPaciente(id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        servicePaciente.eliminarPaciente(id);
    }
    @PutMapping
    public ResponseEntity<?> updateOdontologo(@RequestBody PacienteDto pacienteDto){
        servicePaciente.modificarPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
