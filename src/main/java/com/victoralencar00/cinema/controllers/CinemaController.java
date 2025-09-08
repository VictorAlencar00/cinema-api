package com.victoralencar00.cinema.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victoralencar00.cinema.entities.Cinema;
import com.victoralencar00.cinema.services.CinemaService;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {
    private final CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cinema> getCinemaById(@PathVariable Long id) {
        return ResponseEntity.ok(cinemaService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Cinema>> getAllCinemas() {
        List<Cinema> cinemas = cinemaService.findAll();
        return ResponseEntity.ok(cinemas);
    }

    @PostMapping
    public ResponseEntity<Cinema> createCinema(@RequestBody Cinema cinema) {
        Cinema createdCinema = cinemaService.create(cinema);
        return ResponseEntity.ok(createdCinema);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cinema> updateCinema(@PathVariable Long id, @RequestBody Cinema cinemaDetails) {
        return ResponseEntity.ok(cinemaService.update(id, cinemaDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCinema(@PathVariable Long id) {
        cinemaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
