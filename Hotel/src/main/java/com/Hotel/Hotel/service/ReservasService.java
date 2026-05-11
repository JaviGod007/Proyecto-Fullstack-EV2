package com.Hotel.Hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.DTO.ReservaDTO;
import com.Hotel.Hotel.model.Reservas;
import com.Hotel.Hotel.repository.ReservasRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReservasService {

    @Autowired
    public ReservasRepository reservasRepository;

    public List<ReservaDTO> obtenerTodas() {
        return reservasRepository.findAll().stream()
                .map(this::convertirADTO) //llamamos todas las reservas
                .toList();
    }

    public ReservaDTO buscarPorId(Integer id_reserva) {
        Reservas reservas = reservasRepository.findById(id_reserva)
                .orElseThrow(() -> new RuntimeException("La reserva no existe"));
        return convertirADTO(reservas); // llamamos el rol por su id
    }

    public List<ReservaDTO> buscarPorEstado(String estado){
        return reservasRepository.findByEstado(estado).stream()
                .map(this::convertirADTO)
                .toList();
    }

    //Guardamos una Reserva
    public Reservas guardarReservas(Reservas reservas) {
        return reservasRepository.save(reservas);
    }


    //Eliminamos una reserva por su id
    public String eliminar(Integer id) {
        try {
            Reservas reservas = reservasRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("El usuario con ID " + id + " no existe."));
            reservasRepository.delete(reservas);
            return "La reserva '" + id + "' ha sido eliminada exitosamente.";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    private ReservaDTO convertirADTO(Reservas reservas) {
        ReservaDTO dto = new ReservaDTO();
        dto.setId_reserva(reservas.getIdReserva());
        dto.setFecha_inicio(reservas.getFecha_inicio());
        dto.setFecha_fin(reservas.getFecha_fin());
        dto.setEstado(reservas.getEstado());
        dto.setTotal(reservas.getTotal());
        
        return dto;

    }

}
