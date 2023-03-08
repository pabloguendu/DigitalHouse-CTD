package com.example.finalB1.finalB1.service;


import com.example.finalB1.finalB1.dto.PacienteDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PacienteServiceTest {
    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testCrearPaciente(){
        PacienteDto pacienteDto=new PacienteDto("aRJONA","RICARDO","calle buena vista","36426308","10/4/1992");
        pacienteService.crearPaciente(pacienteDto);

    }



}