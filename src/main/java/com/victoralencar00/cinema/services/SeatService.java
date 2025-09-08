package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Seat;
import com.victoralencar00.cinema.repositories.SeatRepository;

@Service
public class SeatService extends GenericService<Seat> {

    public SeatService(SeatRepository seatRepository) {
        super(seatRepository);
    }
}