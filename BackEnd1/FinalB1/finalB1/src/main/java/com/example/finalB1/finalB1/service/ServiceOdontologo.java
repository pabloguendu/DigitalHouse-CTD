package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.repository.OdontologoRepository;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceOdontologo {

    @Autowired
    private OdontologoRepository odontologoRepository;

    public List<Odontologo> listaOdontologos(){
        return odontologoRepository.findAll();
    }

    public Odontologo agregar(Odontologo odontologo){
        return odontologoRepository.save(odontologo);
    }

    public Optional<Odontologo> buscar(Long id){
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        return odontologo;
    }

    public void borrar (Long id){
        odontologoRepository.deleteById(id);
    }

    public void update (Odontologo o,String matricula,String apellido,String nombre){
        Optional<Odontologo> odontologo=odontologoRepository.findById(o.getId());
        o.setMatricula(matricula);
        o.setNombre(nombre);
        o.setApellido(apellido);

    }


}
