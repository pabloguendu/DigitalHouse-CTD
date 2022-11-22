package com.example.finalB1.finalB1.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Paciente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String domicilio;

    @Column
    private String dni;

    @Column
    private Date fechaAlta;


}
