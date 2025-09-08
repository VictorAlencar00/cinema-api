package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Session;
import com.victoralencar00.cinema.repositories.SessionRepository;

@Service
public class SessionService extends GenericService<Session> {

    public SessionService(SessionRepository sessionRepository) {
        super(sessionRepository);
    }
}