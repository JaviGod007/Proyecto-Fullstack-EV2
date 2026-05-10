package com.Hotel.Hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.DTO.UsuarioDTO;
import com.Hotel.Hotel.model.Usuario;
import com.Hotel.Hotel.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> obtenerTodos(){
        return usuarioRepository.findAll().stream()
                .map(this::convertirADTO)
                .toList();
    }

    public UsuarioDTO buscarPorId(Integer id_usuario){
        Usuario usuario = usuarioRepository.findById(id_usuario)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return convertirADTO(usuario);
    }

    private UsuarioDTO convertirADTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId_usuario(usuario.getId_usuario());
        dto.setNombre(usuario.getNombre());
        dto.setCorreo(usuario.getCorreo());

        if (usuario.getRoles() != null) {
            dto.setNombreRol(usuario.getRoles().getNombre());
        }else{
            dto.setNombreRol("No hay rol asignado :(");
        }
        
        return dto;
    }

}
