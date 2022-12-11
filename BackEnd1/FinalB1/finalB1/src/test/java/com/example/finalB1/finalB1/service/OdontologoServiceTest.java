package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OdontologoServiceTest {
    @Autowired
    private IOdontologoService odontologoService;
    @Test
    public void testCrearOdontologo(){
        OdontologoDto odontologoDto=new OdontologoDto("jacinto","casimiro","abcd123");
        odontologoService.crearOdontologo(odontologoDto);

    }

}