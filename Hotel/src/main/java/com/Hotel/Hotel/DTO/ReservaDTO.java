package com.Hotel.Hotel.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReservaDTO {
    private Integer id_reserva;

    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    private String estado;

    private Integer total;
}
