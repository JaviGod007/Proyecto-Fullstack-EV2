package com.Hotel.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.DTO.ReservaDTO;
import com.Hotel.Hotel.model.Reservas;
import com.Hotel.Hotel.service.ReservasService;

@RestController
@RequestMapping("/api/v1/reserva")
public class ReservasController {

    @Autowired
    public ReservasService reservasService;

    @GetMapping
    public ResponseEntity<List<ReservaDTO>> todasLasReservas(){
        List<ReservaDTO> reservas = reservasService.obtenerTodas();
        if (reservas.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reservas> agregarUsuario(@RequestBody Reservas reservas) {
        try {
            Reservas guardado = reservasService.guardarReservas(reservas);
            return new ResponseEntity<>(guardado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
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

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<ReservaDTO>> buscarPorEstado(@PathVariable String estado) {
        List<ReservaDTO> reserva = reservasService.buscarPorEstado(estado);
        if (reserva.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarReservas(@PathVariable Integer id) {
        String resultado = reservasService.eliminar(id);
        
        // Si el mensaje contiene "exitosamente", es un éxito
        if (resultado.contains("exitosamente")) {
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(resultado, HttpStatus.NOT_FOUND);
        }
    }


}
