package com.grupo_4.Reservacion.controllers;

import com.grupo_4.Reservacion.repositories.ClienteRepository;
import com.grupo_4.Reservacion.exceptions.ClienteNotFoundException;
import com.grupo_4.Reservacion.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/cliente/{username}")
    Cliente getCliente(@PathVariable String username) {
        return clienteRepository.findById(username)
                .orElseThrow(
                        () -> new ClienteNotFoundException("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/cliente")
    Cliente newCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}