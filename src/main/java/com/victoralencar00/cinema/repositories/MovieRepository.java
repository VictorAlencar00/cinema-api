package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
