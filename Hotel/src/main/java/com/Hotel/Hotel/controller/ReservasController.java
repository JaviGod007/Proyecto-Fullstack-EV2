package com.Hotel.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.DTO.ReservaDTO;
import com.Hotel.Hotel.service.ReservasService;

@RestController
@RequestMapping("/api/v1/reserva")
public class ReservasController {

    @Autowired
    public ReservasService reservasService;

    @GetMapping
    public ResponseEntity<List<ReservaDTO>> todosLosUsuarios(){
        List<ReservaDTO> reservas = reservasService.obtenerTodas();
        if (reservas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaDTO> buscarPorId(@PathVariable Integer id) {
        try {
            ReservaDTO reservas = reservasService.buscarPorId(id);
            return new ResponseEntity<>(reservas, HttpStatus.OK);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
