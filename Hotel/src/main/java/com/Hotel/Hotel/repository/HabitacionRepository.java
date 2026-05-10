package com.Hotel.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository <Habitacion, Integer> {


}
