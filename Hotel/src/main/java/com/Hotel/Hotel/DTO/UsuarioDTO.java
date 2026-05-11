package com.Hotel.Hotel.DTO;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Integer idUsuario;

    private String nombre;

    private String correo;

    private String nombreRol;
}
