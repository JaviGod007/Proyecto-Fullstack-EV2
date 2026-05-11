package com.Hotel.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
    
    //buscar un rol por su id
    List<Roles> findByIdroles(Integer id_roles);

    //buscar un rol por su nombre
    List<Roles> findByNombre(String nombre);


}
