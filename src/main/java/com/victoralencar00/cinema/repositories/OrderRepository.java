package com.victoralencar00.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victoralencar00.cinema.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
