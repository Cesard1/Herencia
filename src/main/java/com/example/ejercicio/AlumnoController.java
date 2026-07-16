package com.example.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/alumno")
public class AlumnoController {


        @GetMapping("/crear/{nombre}/{edad}/{matricula}/{carrera}")
        public String crearAlumno(
                @PathVariable String nombre,
                @PathVariable int edad,
                @PathVariable String matricula,
                @PathVariable String carrera
        ) {

            Alumno alumno = new Alumno(nombre, edad, matricula, carrera);

            return alumno.getNombre() + "\n" +
                    alumno.getEdad() + "\n" +
                    alumno.getMatricula() + "\n" +
                    alumno.getCarrera();
        }
    }