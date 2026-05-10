package com.Hotel.Hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.DTO.PagoDTO;
import com.Hotel.Hotel.model.Pago;
import com.Hotel.Hotel.repository.PagoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PagoService {

    @Autowired
    public PagoRepository pagoRepository;

    public List<PagoDTO> obtenerTodo() {
        return pagoRepository.findAll().stream()
                .map(this::convertirADTO)
                .toList();
    }

    public PagoDTO buscarPorId(Integer Id_pago) {
        Pago pago = pagoRepository.findById(Id_pago)
                .orElseThrow(() -> new RuntimeException("El pago no existe"));
            return convertirADTO(pago);
    }

    public Pago guardarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public String eliminar(Integer id) {
        try {
            Pago pago = pagoRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("¡Imposible eliminar! El pago con ID " + id + " no existe."));
            pagoRepository.delete(pago);
            return "El pago '" + pago.getId_pago() + "' ha sido eliminado exitosamente.";
        } catch (RuntimeException e ) {
            return e.getMessage();
        }
    }

    private PagoDTO convertirADTO(Pago pago) {
        PagoDTO dto = new PagoDTO();
        dto.setId_pago(pago.getId_pago());
        dto.setMonto(pago.getMonto());
        dto.setMetodo(pago.getMetodo());
        dto.setEstado(pago.getEstado());

        if (pago.getReservas() != null) {
            dto.setID_reserva(pago.getId_pago());
        } else{
            dto.setID_reserva(null);
        }
            

        return dto;
    }


}
