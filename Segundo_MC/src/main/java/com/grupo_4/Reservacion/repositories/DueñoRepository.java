package com.grupo_4.Reservacion.repositories;

import com.grupo_4.Reservacion.models.Dueño;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DueñoRepository  extends MongoRepository <Dueño, String> {}