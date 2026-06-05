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

    public List<PagoDTO> buscarPorMetodo(String metodo) {
        return pagoRepository.findByMetodo(metodo).stream()
                .map(this::convertirADTO)
                .toList();
    }

    public Pago guardarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    private PagoDTO convertirADTO(Pago pago) {
        PagoDTO dto = new PagoDTO();
        dto.setIdPago(pago.getIdPago());
        dto.setMonto(pago.getMonto());
        dto.setMetodo(pago.getMetodo());
        dto.setEstado(pago.getEstado());

        if (pago.getReserva() != null) {
            dto.setIdReserva(pago.getIdPago());
        } else{
            dto.setIdReserva(null);
        }
            

        return dto;
    }


}
