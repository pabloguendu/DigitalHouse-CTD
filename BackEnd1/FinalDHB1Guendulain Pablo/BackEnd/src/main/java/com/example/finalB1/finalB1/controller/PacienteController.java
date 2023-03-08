package com.example.finalB1.finalB1.controller;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping
    public Collection<PacienteDto> pacienteList() {
        return pacienteService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> pacienteNew(@RequestBody PacienteDto pacienteDto) {
        pacienteService.crearPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDto search(@PathVariable Long id) {
        return pacienteService.buscarPaciente(id);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody PacienteDto pacienteDto) {
        pacienteService.modificarPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}