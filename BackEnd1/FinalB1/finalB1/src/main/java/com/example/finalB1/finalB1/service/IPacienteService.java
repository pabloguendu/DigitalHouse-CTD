package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.dto.PacienteDto;

import java.util.Set;

public interface IPacienteService {
    void crearPaciente(PacienteDto pacienteDto);

    Set<PacienteDto> getTodos();

    PacienteDto buscarPaciente(Long id);

    void eliminarPaciente (Long id);

    void modificarPaciente(PacienteDto pacienteDto);
}
