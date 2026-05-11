package com.Hotel.Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @NotBlank(message = "el nombre no puede estar en blanco")
    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 a 100 caracteres")
    private String nombre;

    @NotBlank(message = "el correo no puede estar en blanco")
    private String correo;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Roles roles;
}