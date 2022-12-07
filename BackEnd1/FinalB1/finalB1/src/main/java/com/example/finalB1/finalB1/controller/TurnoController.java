package com.example.finalB1.finalB1.controller;

import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.dto.TurnoDto;
import com.example.finalB1.finalB1.service.IOdontologoService;
import com.example.finalB1.finalB1.service.IPacienteService;
import com.example.finalB1.finalB1.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {
    @Autowired
    private ITurnoService turnoService;
    @Autowired
    private IPacienteService pacienteService;
    @Autowired
    private IOdontologoService odontologoService;



    @GetMapping
    public List<TurnoDto> turnoList() {
        return turnoService.getTodos();
    }

    @PostMapping
    public ResponseEntity<?> turnoNew(@RequestBody TurnoDto turnoDto) {
        turnoService.crearTurno(turnoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDto search(@PathVariable Long id) {
        return turnoService.buscarTurno(id);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody TurnoDto turnoDto) {
        turnoService.modificarTurno(turnoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
