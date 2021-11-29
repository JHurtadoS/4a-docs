package com.grupo_4.Reservacion.repositories;


import com.grupo_4.Reservacion.models.Cliente;
import com.grupo_4.Reservacion.models.Dueño;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClienteRepository extends MongoRepository <Cliente, String> {
    List<Cliente> findByNombre (String nombre);
}