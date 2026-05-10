package com.Hotel.Hotel.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reserva;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fecha_inicio;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fecha_fin;

    private String estado;

    @NotNull
    private Integer total;
}
