package com.victoralencar00.cinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @EqualsAndHashCode.Include
    @Override
    public Long getId() {
        return super.getId();
    }

    private String name;
    private String email;
    private String password;

}
