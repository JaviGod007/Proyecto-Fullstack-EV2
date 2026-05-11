package com.Hotel.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    List<Usuario> findById_usuario(Integer id_usuario);

    @Query("SELECT u FROM Usuario u WHERE u.id_usuario = :id")
    List<Usuario> buscarPorId(Integer id);
    
}
