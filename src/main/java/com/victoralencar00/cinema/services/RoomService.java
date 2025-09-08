package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Room;
import com.victoralencar00.cinema.repositories.RoomRepository;

@Service
public class RoomService extends GenericService<Room> {

    public RoomService(RoomRepository roomRepository) {
        super(roomRepository);
    }
}