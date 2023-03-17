package com.api.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.entities.User;
import com.api.crud.repositorys.UserRepository;
import com.api.crud.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll(){
		return repository.findAll(); 
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); 
	}
	
	public User insert(User user) {
		return repository.save(user); 
	}
	
	public void deletUser(Long id) {
		repository.deleteById(id);
	}
	
	public User upDate(Long id, User obj) {
		User entity =  repository.getReferenceById(id);
		upDateData(entity, obj);
		return repository.save(entity);
	}

	private void upDateData(User entity, User obj) {	
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setFone(obj.getFone());
	}
}
