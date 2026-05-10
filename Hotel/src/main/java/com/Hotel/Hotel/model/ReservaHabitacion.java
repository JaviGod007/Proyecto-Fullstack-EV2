package com.Hotel.Hotel.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Reserva_Habitacion")
public class ReservaHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id__Reserva_Hab;

    @NotNull
    private Integer Precio_noche;

    @OneToMany
    @JoinColumn(name = "ID_reserva")
    private Reservas reservas;

    @ManyToAny
    @JoinColumn(name = "ID_Habitacion")
    private Habitacion habitacion;









}
