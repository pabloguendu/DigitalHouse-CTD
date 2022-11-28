package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;

import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDto odontologoDto);

    Set<OdontologoDto> getTodos();

    OdontologoDto buscarOdontologo(Long id);

    void eliminarOdontologo (Long id);

    void modificarOdontologo(OdontologoDto odontologoDto);
}

