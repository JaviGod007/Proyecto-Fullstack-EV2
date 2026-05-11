package com.Hotel.Hotel.model;

<<<<<<< HEAD
=======
import jakarta.persistence.Column;
>>>>>>> 182d37471347a897a55e1d6270b0b7bf5fb8694c
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
<<<<<<< HEAD
=======
import jakarta.validation.constraints.NotBlank;
>>>>>>> 182d37471347a897a55e1d6270b0b7bf5fb8694c
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Integer Id_hotel;
}
=======
    @Column(name = "ID_Hotel")
    private Integer Id_Hotel;

    @NotBlank(message = "El nombre del hotel no puede estar en blanco")
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotBlank(message = "La dirección no puede estar en blanco")
    @Column(nullable = false, length = 200)
    private String direccion;
}
>>>>>>> 182d37471347a897a55e1d6270b0b7bf5fb8694c
