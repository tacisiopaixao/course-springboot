package com.api.gel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gel.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
