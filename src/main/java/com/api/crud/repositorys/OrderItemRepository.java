package com.api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}