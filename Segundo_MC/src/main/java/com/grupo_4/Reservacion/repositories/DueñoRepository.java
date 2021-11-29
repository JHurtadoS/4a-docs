package com.grupo_4.Reservacion.repositories;

import com.grupo_4.Reservacion.models.Dueño;
import com.grupo_4.Reservacion.models.Propiedad;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DueñoRepository  extends MongoRepository <Dueño, String>{
    List<Dueño> findBynombre (String nombre);

}