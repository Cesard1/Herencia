package com.example.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {


    @GetMapping("/crear/{nombre}/{edad}/{puesto}/{sueldo}")
    public String crearTrabajador(
            @PathVariable String nombre,
            @PathVariable int edad,
            @PathVariable String puesto,
            @PathVariable double sueldo
    ) {

        Trabajador trabajador1 = new Trabajador(
                nombre,
                edad,
                puesto,
                sueldo
        );

        return "Nombre: " + trabajador1.getNombre() + "\n" +
                "Edad: " + trabajador1.getEdad() + "\n" +
                "Puesto: " + trabajador1.getPuesto() + "\n" +
                "Sueldo: $" + trabajador1.getSueldo();
    }
}