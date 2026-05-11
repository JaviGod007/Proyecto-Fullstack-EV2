package com.Hotel.Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_roles;
    
    @NotBlank
    @Size(min = 3, max = 100, message = "el nombre del rol debe tener entre 3 y 100 caracteres" )
    private String nombre;

    @OneToMany(mappedBy = "id_usuario")
    @ToString.Exclude
    private Usuario usuario;
}
