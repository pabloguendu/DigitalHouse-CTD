package com.example.finalB1.finalB1.repository;

import com.example.finalB1.finalB1.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo,Long> {

}
