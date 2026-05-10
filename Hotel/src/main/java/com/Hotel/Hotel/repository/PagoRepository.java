package com.Hotel.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository <Pago , Integer> {

    // Buscar todos los pagos de una reserva específica
    List<Pago> findByReservasIdReserva(Integer idReserva);
    
    // Buscar pagos por método (ej. "TARJETA")
    List<Pago> findByMetodo(String metodo);
    
}
