package com.api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}