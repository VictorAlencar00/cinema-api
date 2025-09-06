package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Session;
import com.victoralencar00.cinema.repositories.SessionRepository;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public List<Session> findAllSessions() {
        return sessionRepository.findAll();
    }

    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }
}