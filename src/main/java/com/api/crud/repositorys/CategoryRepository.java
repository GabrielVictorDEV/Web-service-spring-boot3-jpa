package com.api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}