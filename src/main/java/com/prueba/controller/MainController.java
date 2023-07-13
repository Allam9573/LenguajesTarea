package com.prueba.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.AlumnoDTO;

@RestController
@RequestMapping("/api")
public class MainController {

	ArrayList<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();

	@GetMapping("/alumno/mostrar")
	public String mostrarAlumno(@RequestBody AlumnoDTO alumno) {
		return alumno.toString();
	}

	@GetMapping("/alumno/insertar")
	public void crearAlumno(@RequestBody AlumnoDTO alumno) {
		listaAlumnos.add(alumno);
	}
}
