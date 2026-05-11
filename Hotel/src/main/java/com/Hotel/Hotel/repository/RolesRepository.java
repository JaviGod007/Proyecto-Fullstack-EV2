package com.Hotel.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
    

}
