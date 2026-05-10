package com.Hotel.Hotel.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Habitacion;

    @ManyToAny
    @JoinColumn(name = "ID_hotel")
    private Hotel hotel;

    @ManyToAny
    @JoinColumn(name = "ID_tipo_hab")
    private TipoHabitacion tipoHabitacion;

    private Integer numero;

    private String estado;
}
