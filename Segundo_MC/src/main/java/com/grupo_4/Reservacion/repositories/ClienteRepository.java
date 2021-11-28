package com.grupo_4.Reservacion.repositories;


import com.grupo_4.Reservacion.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository <Cliente, String> { }