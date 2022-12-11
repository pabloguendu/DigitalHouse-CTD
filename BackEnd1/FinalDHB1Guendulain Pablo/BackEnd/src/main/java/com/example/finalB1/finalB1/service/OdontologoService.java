package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<OdontologoDto> getTodos() {
        List<Odontologo> listaOdontologo= odontologoRepository.findAll();
        List<OdontologoDto> odontologoDto= new ArrayList<>();
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
        if(odontologoRepository.findById(o.getId()).isPresent()) {
            odontologoRepository.save(o);
        }
    }
}
