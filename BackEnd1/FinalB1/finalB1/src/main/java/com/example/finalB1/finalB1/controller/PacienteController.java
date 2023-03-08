package com.example.finalB1.finalB1.controller;

<<<<<<< HEAD
import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.entity.Paciente;
import com.example.finalB1.finalB1.service.PacienteService;
=======
import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.service.IPacienteService;
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import java.util.Set;
=======
import java.util.Collection;
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping
<<<<<<< HEAD
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
=======
    public Collection<PacienteDto> pacienteList() {
        return pacienteService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> pacienteNew(@RequestBody PacienteDto pacienteDto) {
        pacienteService.crearPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747

    @GetMapping("/{id}")
    public PacienteDto search(@PathVariable Long id) {
        return pacienteService.buscarPaciente(id);
    }
<<<<<<< HEAD
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        servicePaciente.eliminarPaciente(id);
    }
    @PutMapping
    public ResponseEntity<?> updateOdontologo(@RequestBody PacienteDto pacienteDto){
        servicePaciente.modificarPaciente(pacienteDto);
=======

    @PutMapping
    public ResponseEntity<?> update(@RequestBody PacienteDto pacienteDto) {
        pacienteService.modificarPaciente(pacienteDto);
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}