package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Movie;
import com.victoralencar00.cinema.repositories.MovieRepository;

@Service
public class MovieService extends GenericService<Movie> {

    public MovieService(MovieRepository movieRepository) {
        super(movieRepository);
    }

}