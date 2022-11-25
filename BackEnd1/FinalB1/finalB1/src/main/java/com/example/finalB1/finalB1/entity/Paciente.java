package com.example.finalB1.finalB1.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@Table(name = "paciente")
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
