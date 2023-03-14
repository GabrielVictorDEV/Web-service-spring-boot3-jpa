package com.api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}