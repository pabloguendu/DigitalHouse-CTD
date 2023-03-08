package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.entity.Paciente;
import com.example.finalB1.finalB1.repository.IOdontologoRepository;
import com.example.finalB1.finalB1.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService implements IPacienteService {
    @Autowired
    private IPacienteRepository pacienteRepository;
    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearPaciente(PacienteDto pacienteDto) {
        Paciente p=mapper.convertValue(pacienteDto,Paciente.class);
        pacienteRepository.save(p);

    }

    @Override
    public List<PacienteDto> getTodos() {
        List<Paciente> listaPaciente= pacienteRepository.findAll();
        List<PacienteDto> pacienteDto= new ArrayList<>();
        for (Paciente p:listaPaciente){
            pacienteDto.add(mapper.convertValue(p,PacienteDto.class));
        }
        return pacienteDto;
    }

    @Override
    public PacienteDto buscarPaciente(Long id) {
        Optional<Paciente> p = pacienteRepository.findById(id);
        PacienteDto pacienteDto =null;
        if (p.isPresent()){
            pacienteDto=mapper.convertValue(p,PacienteDto.class);
        }
        return pacienteDto;
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public void modificarPaciente(PacienteDto pacienteDto) {
        Paciente p=mapper.convertValue(pacienteDto,Paciente.class);
        if(pacienteRepository.findById(p.getId()).isPresent()) {
            Paciente pacientMod= pacienteRepository.getById(p.getId());
            pacientMod.setApellido(p.getApellido());
            pacientMod.setNombre(p.getNombre());
            pacientMod.setDomicilio(p.getDomicilio());
            pacientMod.setDni(p.getDni());
            pacientMod.setFechaAlta(p.getFechaAlta());

            pacienteRepository.save(pacientMod);

        }
    }
}
