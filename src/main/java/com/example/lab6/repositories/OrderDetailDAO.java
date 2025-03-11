package com.example.lab6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab6.entities.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
}