package com.victoralencar00.cinema.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victoralencar00.cinema.entities.Order;
import com.victoralencar00.cinema.repositories.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}