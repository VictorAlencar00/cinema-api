package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Movie;
import com.victoralencar00.cinema.repositories.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}