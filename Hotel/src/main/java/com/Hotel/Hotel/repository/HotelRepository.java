package com.Hotel.Hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hotel.Hotel.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {


    List<Hotel> findByNombre(String nombre);
 
   
    List<Hotel> findByDireccion(String direccion);

}
