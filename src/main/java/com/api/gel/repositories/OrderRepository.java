package com.api.gel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gel.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
