package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
