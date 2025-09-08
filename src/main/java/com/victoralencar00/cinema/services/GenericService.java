package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.BaseEntity;
import com.victoralencar00.cinema.services.exceptions.ResourceNotFoundException;

public abstract class GenericService<T extends BaseEntity> {

    private final JpaRepository<T, Long> repository;

    public GenericService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado com o ID: " + id));
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public T update(Long id, T entityToUpdate) {
        entityToUpdate.setId(id);
        return repository.save(entityToUpdate);
    }

    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}