package com.Hotel.Hotel.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Hotel.Hotel.DTO.HotelDTO;
import com.Hotel.Hotel.model.Hotel;
import com.Hotel.Hotel.repository.HotelRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<HotelDTO> obtenerTodo() {
        return hotelRepository.findAll().stream()
                .map(this::convertirADTO)
                .toList();
    }

    public HotelDTO buscarPorId(Integer id) {
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("El hotel no existe"));
        return convertirADTO(hotel);
    }

    public List<HotelDTO> buscarPorNombre(String nombre) {
        return hotelRepository.findByNombre(nombre).stream()
                .map(this::convertirADTO)
                .toList();
    }

    public HotelDTO guardarHotel(Hotel hotel) {
        Hotel guardado = hotelRepository.save(hotel);
        return convertirADTO(guardado);
    }

    public String eliminar(Integer id) {
        if (!hotelRepository.existsById(id)) {
            return "El hotel con ID " + id + " no existe.";
        }
        hotelRepository.deleteById(id);
        return "El hotel ha sido eliminado exitosamente.";
    }

    private HotelDTO convertirADTO(Hotel hotel) {
        if (hotel == null) return null;
        HotelDTO dto = new HotelDTO();
       
        dto.setId_hotel(hotel.getIdHotel());
        dto.setNombre(hotel.getNombre());      
        dto.setDireccion(hotel.getDireccion());
        
       
        return dto;
    }
}