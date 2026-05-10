package com.Hotel.Hotel.model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_pago;

    @ManyToAny
    @JoinColumn(name = "ID_reserva")
    private Reservas reservas;

    private Integer monto;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fecha_pago;

    private String Metodo;

    private Boolean estado;



}
