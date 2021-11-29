package com.grupo_4.Reservacion.controllers;

import com.grupo_4.Reservacion.exceptions.AlquilerNotFoundExepcion;
import com.grupo_4.Reservacion.exceptions.MoneyInsuficientException;
import com.grupo_4.Reservacion.repositories.AlquilerRepository;
import com.grupo_4.Reservacion.models.Alquiler;
import com.grupo_4.Reservacion.models.Dueño;
import com.grupo_4.Reservacion.models.Propiedad;

import com.grupo_4.Reservacion.models.Cliente;


import com.grupo_4.Reservacion.repositories.ClienteRepository;
import com.grupo_4.Reservacion.repositories.DueñoRepository;
import com.grupo_4.Reservacion.repositories.PropiedadRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlquilerController {

    private final AlquilerRepository alquilerRepository;
    private final DueñoRepository dueñoRepository;
    private PropiedadRepository propiedadRepository;

    private final ClienteRepository clienteRepository;


    public AlquilerController(AlquilerRepository alquilerRepository, DueñoRepository dueñoRepository,ClienteRepository clienteRepository,PropiedadRepository propiedadRepository) {
        this.alquilerRepository = alquilerRepository;
        this.clienteRepository = clienteRepository;
        this.dueñoRepository = dueñoRepository;
        this.propiedadRepository = propiedadRepository;

    }

    @GetMapping("/alquiler/{username}")
    Alquiler getAlquiler(@PathVariable String username) {
        return alquilerRepository.findById(username)
                .orElseThrow(
                        () -> new AlquilerNotFoundExepcion("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/reserva")

    Alquiler newAlquiler(@RequestBody Alquiler alquiler) {
        Cliente cliente = clienteRepository.findByNombre(alquiler.getNombreCliente()).orElse(null);
        Dueño dueño = dueñoRepository.findBynombre(alquiler.getNombreDueño()).orElse(null);
        Propiedad propiedad = propiedadRepository.findByid(alquiler.getNombreDueño()).orElse(null);

        if((dueño.getDinero_actual()<propiedad.getPrecio()) && (cliente!=null && propiedad!=null)){
            throw new MoneyInsuficientException("No se posee dinero suficiente para la reservacion");
        }

        if(cliente!=null){
            throw new MoneyInsuficientException("No se encontro el cliente");
        }

        if(propiedad!=null){
            throw new MoneyInsuficientException("No se encontro la propiedad");
        }
        if(dueño!=null){
            throw new MoneyInsuficientException("No se encontro el dueño");
        }


        cliente.setDinero_actual(cliente.getDinero_actual()-propiedad.getPrecio());
        clienteRepository.save(cliente);

        dueño.setDinero_actual(dueño.getDinero_actual()+propiedad.getPrecio());
        dueñoRepository.save(dueño);

        propiedad.setEstado("Ocupado por el cliente:"+cliente.getNombre());

        return alquilerRepository.save(alquiler);
    }

}