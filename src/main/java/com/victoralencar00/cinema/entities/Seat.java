package com.victoralencar00.cinema.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "seats")
public class Seat extends BaseEntity {
    @EqualsAndHashCode.Include
    @Override
    public Long getId() {
        return super.getId();
    }

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
