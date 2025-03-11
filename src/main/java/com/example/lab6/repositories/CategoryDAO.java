package com.example.lab6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab6.entities.Category;

public interface CategoryDAO extends JpaRepository<Category, String> {
}
