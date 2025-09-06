package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Seat;
import com.victoralencar00.cinema.repositories.SeatRepository;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> findAllSeats() {
        return seatRepository.findAll();
    }

    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }
}