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

import com.victoralencar00.cinema.entities.Seat;
import com.victoralencar00.cinema.services.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping
    public ResponseEntity<List<Seat>> getAllSeats() {
        List<Seat> seats = seatService.findAll();
        return ResponseEntity.ok(seats);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seat> getSeatById(@PathVariable Long id) {
        Seat seat = seatService.findById(id);
        return ResponseEntity.ok(seat);
    }

    @PostMapping
    public ResponseEntity<Seat> createSeat(@RequestBody Seat seat) {
        Seat createdSeat = seatService.create(seat);
        return ResponseEntity.ok(createdSeat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seat> updateSeat(@PathVariable Long id, @RequestBody Seat seatDetails) {
        Seat updatedSeat = seatService.update(id, seatDetails);
        return ResponseEntity.ok(updatedSeat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeat(@PathVariable Long id) {
        seatService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
