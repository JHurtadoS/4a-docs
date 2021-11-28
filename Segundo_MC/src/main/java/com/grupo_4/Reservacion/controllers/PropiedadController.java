package com.grupo_4.Reservacion.controllers;

import com.grupo_4.Reservacion.repositories.PropiedadRepository;
import com.grupo_4.Reservacion.exceptions.PropiedadNotFoundException;
import com.grupo_4.Reservacion.models.Propiedad;
import org.springframework.web.bind.annotation.*;

@RestController
public class PropiedadController {

    private final PropiedadRepository propiedadRepository;

    public PropiedadController(PropiedadRepository propiedadRepository) {
        this.propiedadRepository = propiedadRepository;
    }

    @GetMapping("/propiedad/{username}")
    Propiedad getPropiedad(@PathVariable String username) {
        return propiedadRepository.findById(username)
                .orElseThrow(
                        () -> new PropiedadNotFoundException("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/propiedad")
    Propiedad newPropiedad(@RequestBody Propiedad propiedad) {
        return propiedadRepository.save(propiedad);
    }
}