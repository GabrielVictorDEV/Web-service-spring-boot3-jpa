package com.api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}