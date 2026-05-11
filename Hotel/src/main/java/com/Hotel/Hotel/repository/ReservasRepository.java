package com.Hotel.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Reservas;

@Repository
public interface ReservasRepository extends JpaRepository <Reservas, Integer>{


}
