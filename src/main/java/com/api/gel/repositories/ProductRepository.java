package com.api.gel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gel.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
