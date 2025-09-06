package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
