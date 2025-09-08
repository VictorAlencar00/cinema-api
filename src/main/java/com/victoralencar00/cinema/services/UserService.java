package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.User;
import com.victoralencar00.cinema.repositories.UserRepository;

@Service
public class UserService extends GenericService<User> {

    public UserService(UserRepository userRepository) {
        super(userRepository);
    }
}