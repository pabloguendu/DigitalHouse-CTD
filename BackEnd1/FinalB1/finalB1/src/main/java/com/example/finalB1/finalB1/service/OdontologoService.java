package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    private IOdontologoRepository odontologoRepository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public void crearOdontologo(OdontologoDto odontologoDto) {
        Odontologo o=mapper.convertValue(odontologoDto,Odontologo.class);
        odontologoRepository.save(o);

    }
    @Override
    public Set<OdontologoDto> getTodos() {
        List<Odontologo> listaOdontologo= odontologoRepository.findAll();
        Set<OdontologoDto> odontologoDto= new HashSet<>();
        for (Odontologo o:listaOdontologo){
            odontologoDto.add(mapper.convertValue(o,OdontologoDto.class));
        }
        return odontologoDto;
    }

    @Override
    public OdontologoDto buscarOdontologo(Long id) {
        Optional<Odontologo> o = odontologoRepository.findById(id);
        OdontologoDto odontologoDto=null;
        if (o.isPresent()){
            odontologoDto=mapper.convertValue(o,OdontologoDto.class);
        }
        return odontologoDto;
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);

    }

    @Override
    public void modificarOdontologo(OdontologoDto odontologoDto) {
        Odontologo o=mapper.convertValue(odontologoDto,Odontologo.class);
        odontologoRepository.save(o);
    }
}
