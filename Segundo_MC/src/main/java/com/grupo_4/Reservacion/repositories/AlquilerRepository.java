package com.grupo_4.Reservacion.repositories;


import com.grupo_4.Reservacion.models.Alquiler;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AlquilerRepository extends MongoRepository <Alquiler, String> {
        List<Alquiler> findByIDPropiedad (String NombrePropiedad);
        List<Alquiler> findByNombreCliente (String nombreCliente);

}
