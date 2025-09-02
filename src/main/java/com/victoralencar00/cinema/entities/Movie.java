package com.victoralencar00.cinema.entities;

import java.util.List;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "movies")
public class Movie extends BaseEntity {

    private String title;
    private String genre;
    private int duration;

    @OneToMany(mappedBy = "movie")
    private List<Session> session;
}
