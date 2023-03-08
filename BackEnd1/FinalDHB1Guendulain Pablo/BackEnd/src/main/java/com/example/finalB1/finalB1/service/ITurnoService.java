package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.dto.TurnoDto;

import java.util.List;
import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDto turnoDto);

    List<TurnoDto> getTodos();

    TurnoDto buscarTurno(Long id);

    void eliminarTurno (Long id);

    void modificarTurno(TurnoDto turnoDto);
}
