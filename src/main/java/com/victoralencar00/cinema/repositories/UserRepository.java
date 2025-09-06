package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
