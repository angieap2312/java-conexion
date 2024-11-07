package com.example.demo;

import com.example.demo.dao.entities.Estudiante;
import com.example.demo.services.CrudService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CrudService crudService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Gson gson = new Gson().newBuilder().serializeNulls().create();

		//se obtienen todos los estudiantes
		List<Estudiante> lista = crudService.obtenerTodosLosEstudiantes();
		lista.forEach(item-> System.out.println(gson.toJson(item)));


		//Se crea un nuevo estudiante
		/*Estudiante estudianteNuevo = new Estudiante();
		estudianteNuevo.setDocEst("123213");
		estudianteNuevo.setNomEst("Angie");
		estudianteNuevo.setApeEst("Quina");
		estudianteNuevo.setEdadEst(22);

		crudService.guardarEstudiante(estudianteNuevo);
		System.out.println("El estudiante se guardó con éxito!");

		//se elimina un estudiante
		crudService.eliminarEstudiante("1098765679");
		System.out.println("Se eliminó correctamente");*/

		//Se actualiza un estudiante
		Estudiante actualizarEstudiante = new Estudiante();
		actualizarEstudiante.setDocEst("1098098097");
		actualizarEstudiante.setNomEst("prueba actualizar");
		actualizarEstudiante.setApeEst("prueba apellido");
		actualizarEstudiante.setEdadEst(22);

		crudService.actualizarEstudiante(actualizarEstudiante);
	}

}
