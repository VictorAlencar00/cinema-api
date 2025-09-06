package com.victoralencar00.cinema;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.victoralencar00.cinema.entities.Movie;
import com.victoralencar00.cinema.repositories.MovieRepository;

@DataJpaTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    @DisplayName("Deve salvar um filme com sucesso quando os dados estão corretos")
    void save_ShouldPersistMovie_WhenSuccessful() {
        Movie movieToSave = new Movie();
        movieToSave.setTitle("De Volta para o Futuro");
        movieToSave.setGenre("Ficção Científica");
        movieToSave.setDuration(116);

        Movie savedMovie = this.movieRepository.save(movieToSave);

        assertThat(savedMovie).isNotNull();
        assertThat(savedMovie.getId()).isNotNull();
        assertThat(savedMovie.getTitle()).isEqualTo("De Volta para o Futuro");
    }
}