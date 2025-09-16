package com.victoralencar00.cinema.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserUpdateDTO(
        @NotBlank(message = "O nome não pode estar em branco") String name,
        @NotBlank(message = "O email não pode estar em branco") @Email(message = "Formato de email inválido") String email,
        String password) {
}