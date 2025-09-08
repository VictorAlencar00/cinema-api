package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Cinema;
import com.victoralencar00.cinema.repositories.CinemaRepository;

@Service
public class CinemaService extends GenericService<Cinema> {
    public CinemaService(CinemaRepository cinemaRepository) {
        super(cinemaRepository);
    }
}
