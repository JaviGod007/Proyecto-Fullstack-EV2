package com.Hotel.Hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hotel.Hotel.model.HabitacionServicio;

@Repository
public interface HabitacionServicioRepository extends JpaRepository<HabitacionServicio, Integer> {


    List<HabitacionServicio> findByHabitacion_IdHabitacion(Integer idHabitacion);

    List<HabitacionServicio> findByServicio_IdServicio(Integer idServicio);

}