package com.victoralencar00.cinema.services;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Order;
import com.victoralencar00.cinema.repositories.OrderRepository;

@Service
public class OrderService extends GenericService<Order> {

    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
    }

}