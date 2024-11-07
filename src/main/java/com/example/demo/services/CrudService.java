package com.example.demo.services;

import com.example.demo.dao.entities.Estudiante;
import com.example.demo.dao.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {
    @Autowired
    private EstudianteRepository estudianteRepository;


    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void eliminarEstudiante(String documento) {
        estudianteRepository.deleteById(documento);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        Optional<Estudiante> estudianteEncontrado = estudianteRepository.findById(estudiante.getDocEst());

        if(estudianteEncontrado.isPresent()){
            estudianteRepository.save(estudiante);
        }else {
            System.out.println("El estudiante con documento " + estudiante.getDocEst() + " no existe");
        }
    }
}
