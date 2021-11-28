package com.grupo_4.Reservacion.controllers;

import com.grupo_4.Reservacion.repositories.DueñoRepository;
import com.grupo_4.Reservacion.exceptions.DueñoNotFoundException;
import com.grupo_4.Reservacion.models.Dueño;
import org.springframework.web.bind.annotation.*;

@RestController
public class DueñoController {

    private final DueñoRepository dueñoRepository;

    public DueñoController(DueñoRepository dueñoRepository) {
        this.dueñoRepository = dueñoRepository;
    }

    @GetMapping("/dueño/{username}")
    Dueño getDueño(@PathVariable String username) {
        return dueñoRepository.findById(username)
                .orElseThrow(
                        () -> new DueñoNotFoundException("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/dueño")
    Dueño newDueño(@RequestBody Dueño dueño) {
        return dueñoRepository.save(dueño);
    }
}
