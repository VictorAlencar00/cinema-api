package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Cinema;
import com.victoralencar00.cinema.repositories.CinemaRepository;

@Service
public class CinemaService {

    private final CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<Cinema> findAllCinemas() {
        return cinemaRepository.findAll();
    }

    public Cinema createCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

}
