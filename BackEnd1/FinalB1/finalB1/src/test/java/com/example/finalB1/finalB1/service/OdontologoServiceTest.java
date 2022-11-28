package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OdontologoServiceTest {
    @Autowired
    private IOdontologoService odontologoService;
    @Test
    public void testCrearOdontologo(){
        OdontologoDto odontologoDto=new OdontologoDto();
        odontologoDto.setApellido("Jacinto");
        odontologoDto.setNombre("Casimiro");
        odontologoService.crearOdontologo(odontologoDto);

        OdontologoDto odontologoJacinto= odontologoService.buscarOdontologo(1L);
        assertTrue(odontologoJacinto!=null);

    }

}