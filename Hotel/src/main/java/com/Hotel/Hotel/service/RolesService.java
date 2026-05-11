package com.Hotel.Hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.DTO.RolesDTO;
import com.Hotel.Hotel.model.Roles;
import com.Hotel.Hotel.repository.RolesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolesService {

    @Autowired
    public RolesRepository rolesRepository;

    public List<RolesDTO> obtenerTodas() {
        return rolesRepository.findAll().stream()
                .map(this::convertirADTO) //llamamos todas las reservas
                .toList();
    }

    public RolesDTO buscarPorId(Integer id_roles) {
        Roles roles = rolesRepository.findById(id_roles)
                .orElseThrow(() -> new RuntimeException("La reserva no existe"));
        return convertirADTO(roles); // llamamos el rol por su id
    }

    public List<RolesDTO> buscarPorNombre(String nombre){
        return rolesRepository.findByNombre(nombre).stream()
                .map(this::convertirADTO)
                .toList();
    }

    //Guardamos un nuevo rol
    public Roles guardarRol(Roles roles) {
        return rolesRepository.save(roles);
    }

    //Borramos un rol por su id
    public String eliminar(Integer id) {
        try {
            Roles roles = rolesRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException(" El rol con ID " + id + " no existe."));
            rolesRepository.delete(roles);
            return "El héroe '" + roles.getNombre() + "El rol a sido eliminado exitosamente.";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    private RolesDTO convertirADTO(Roles roles) {
        RolesDTO dto = new RolesDTO();
        dto.setId_roles(roles.getIdroles());
        dto.setNombre(roles.getNombre());

        if (roles.getUsuario() != null) {
            dto.setNombreUsuarios(roles.getUsuario().getNombre());
        }else{
            dto.setNombreUsuarios("No hay usuarios asignados al rol");
        }
        
        return dto;
    }

}

