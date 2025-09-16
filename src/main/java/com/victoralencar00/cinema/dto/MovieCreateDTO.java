package com.victoralencar00.cinema.dto;

import jakarta.validation.constraints.NotBlank;

public record MovieCreateDTO(
        @NotBlank(message = "O nome não pode estar em branco") String title,
        @NotBlank(message = "A descrição não pode estar em branco") String synopsis,
        @NotBlank(message = "O gênero não pode estar em branco") String genre) {
}
