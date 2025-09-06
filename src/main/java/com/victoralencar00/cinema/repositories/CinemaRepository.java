package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

}
