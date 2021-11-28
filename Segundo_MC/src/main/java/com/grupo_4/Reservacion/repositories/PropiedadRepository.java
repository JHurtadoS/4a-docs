package com.grupo_4.Reservacion.repositories;

import com.grupo_4.Reservacion.models.Propiedad;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PropiedadRepository extends MongoRepository <Propiedad, String> {
    List<Propiedad> findByNombreDueño (String nombreDueño);

}