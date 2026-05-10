package com.Hotel.Hotel.DTO;

import lombok.Data;

@Data
public class PagoDTO {


    private Integer Id_pago;

    private Integer monto;

    private String metodo;

    private Boolean estado;

    private Integer ID_reserva;
}
