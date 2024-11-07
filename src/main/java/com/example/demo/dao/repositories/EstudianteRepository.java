package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, String>{
}
