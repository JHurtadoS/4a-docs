package com.grupo_4.Reservacion.controllers;

import com.grupo_4.Reservacion.exceptions.AlquilerNotFoundExepcion;
import com.grupo_4.Reservacion.repositories.AlquilerRepository;
import com.grupo_4.Reservacion.models.Alquiler;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlquilerController {

    private final AlquilerRepository alquilerRepository;

    public AlquilerController(AlquilerRepository alquilerRepository) {
        this.alquilerRepository = alquilerRepository;
    }

    @GetMapping("/alquiler/{username}")
    Alquiler getAlquiler(@PathVariable String username) {
        return alquilerRepository.findById(username)
                .orElseThrow(
                        () -> new AlquilerNotFoundExepcion("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/cliente")
    Alquiler newAlquiler(@RequestBody Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }
}