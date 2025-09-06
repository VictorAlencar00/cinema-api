package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Room;
import com.victoralencar00.cinema.repositories.RoomRepository;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findAllRooms() {
        return roomRepository.findAll();
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }
}