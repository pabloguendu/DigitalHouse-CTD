package com.example.finalB1.finalB1.service;

import com.example.finalB1.finalB1.entity.Odontologo;
import com.example.finalB1.finalB1.entity.Paciente;
import com.example.finalB1.finalB1.repository.OdontologoRepository;
import com.example.finalB1.finalB1.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listaPacientes(){
        return (List<Paciente>) pacienteRepository.findAll();
    }

    public Paciente agregar(Paciente p){
        return pacienteRepository.save(p);
    }

    public Optional<Paciente> buscar(Long id){
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        return paciente;
    }

    public void borrar (Long id){
        pacienteRepository.deleteById(id);
    }

    public Paciente update (Paciente p) {
        Paciente paciente = pacienteRepository.getById(p.getId());
        paciente.setNombre(p.getNombre());
        paciente.setApellido(p.getApellido());
        paciente.setDomicilio(p.getDomicilio());
        paciente.setDni(p.getDni());
        paciente.setFechaAlta(p.getFechaAlta());
        return pacienteRepository.save(paciente);

    }

}
