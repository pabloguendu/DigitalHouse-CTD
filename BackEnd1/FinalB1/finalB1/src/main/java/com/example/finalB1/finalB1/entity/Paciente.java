package com.example.finalB1.finalB1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;


@Entity
@NoArgsConstructor
@Table(name = "Pacientes")
public class Paciente {
    @Column(name = "id")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(name="domicilio")
    private String domicilio;

    @Column(name="dni")
    private String dni;

    @Column(name = "fechaAlta")
    private String fechaAlta;
    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
<<<<<<< HEAD
    private Set<Turno> turnoPaciente;
    
=======
    private List<Turno> turnoPaciente;
>>>>>>> 4be0c597166a4bab5026c40e1c0b6053bddf1747

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Turno> getTurnoPaciente() {
        return turnoPaciente;
    }

    public void setTurnoPaciente(List<Turno> turnoPaciente) {
        this.turnoPaciente = turnoPaciente;
    }
}
