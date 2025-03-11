package com.example.lab6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab6.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
