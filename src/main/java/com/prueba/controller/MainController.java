package com.prueba.controller;

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

	@GetMapping("/alumno/mostrar")
	public String mostrarAlumno(@RequestBody AlumnoDTO alumno) {
		return alumno.toString();
	}
}
