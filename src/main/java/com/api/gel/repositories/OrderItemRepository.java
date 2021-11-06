package com.api.gel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gel.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
