package com.example.finalB1.finalB1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
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
    private Date fechaAlta;
    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> turnoPaciente;

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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Set<Turno> getTurnoPaciente() {
        return turnoPaciente;
    }

    public void setTurnoPaciente(Set<Turno> turnoPaciente) {
        this.turnoPaciente = turnoPaciente;
    }
}
