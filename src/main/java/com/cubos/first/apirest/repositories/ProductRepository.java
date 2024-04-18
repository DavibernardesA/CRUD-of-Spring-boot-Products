package com.cubos.first.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubos.first.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  
}
