package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
