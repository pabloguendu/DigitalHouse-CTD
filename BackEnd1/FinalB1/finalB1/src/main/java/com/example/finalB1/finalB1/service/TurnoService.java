package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.dto.OdontologoDto;
import com.example.finalB1.finalB1.dto.PacienteDto;
import com.example.finalB1.finalB1.dto.TurnoDto;
import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.entity.Turno;
import com.example.finalB1.finalB1.repository.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;
    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearTurno(TurnoDto turnoDto) {
        Turno t=mapper.convertValue(turnoDto,Turno.class);
        turnoRepository.save(t);

    }

    @Override
    public Set<TurnoDto> getTodos() {
        List<Turno> listaTurno= turnoRepository.findAll();
        Set<TurnoDto> turnoDto= new HashSet<>();
        for (Turno t:listaTurno){
            turnoDto.add(mapper.convertValue(t,TurnoDto.class));
        }
        return turnoDto;
    }

    @Override
    public TurnoDto buscarTurno(Long id) {
        Optional<Turno> t = turnoRepository.findById(id);
        TurnoDto turnoDto=null;
        if (t.isPresent()){
            turnoDto=mapper.convertValue(t,TurnoDto.class);
        }
        return turnoDto;

    }

    @Override
    public void eliminarTurno(Long id) {
        turnoRepository.deleteById(id);

    }

    @Override
    public void modificarTurno(TurnoDto turnoDto) {
        Turno t=mapper.convertValue(turnoDto,Turno.class);
        turnoRepository.save(t);
    }
}
