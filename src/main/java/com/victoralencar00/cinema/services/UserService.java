package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.dto.UserCreateDTO;
import com.victoralencar00.cinema.dto.UserResponseDTO;
import com.victoralencar00.cinema.dto.UserUpdateDTO;
import com.victoralencar00.cinema.entities.User;
import com.victoralencar00.cinema.repositories.UserRepository;
import com.victoralencar00.cinema.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResponseDTO create(UserCreateDTO createDTO) {
        User user = new User();
        user.setName(createDTO.name());
        user.setEmail(createDTO.email());
        user.setPassword(passwordEncoder.encode(createDTO.password()));

        User savedUser = userRepository.save(user);
        return toResponseDTO(savedUser);
    }

    public UserResponseDTO findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com o ID: " + id));
        return toResponseDTO(user);
    }

    public List<UserResponseDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public UserResponseDTO update(Long id, UserUpdateDTO updateDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com o ID: " + id));

        user.setName(updateDTO.name());
        user.setEmail(updateDTO.email());

        User updatedUser = userRepository.save(user);
        return toResponseDTO(updatedUser);
    }

    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("Usuário não encontrado com o ID: " + id);
        }
        userRepository.deleteById(id);
    }

    private UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(user.getId(), user.getName(), user.getEmail());
    }
}