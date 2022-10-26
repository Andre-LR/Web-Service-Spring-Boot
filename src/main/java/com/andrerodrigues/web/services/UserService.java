package com.andrerodrigues.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerodrigues.web.entities.User;
import com.andrerodrigues.web.repositories.UserRepository;
import com.andrerodrigues.web.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
    }
    
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id){
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User userDB = repository.getReferenceById(id);

		userDB.setName(obj.getName());
		userDB.setEmail(obj.getEmail());
		userDB.setPhone(obj.getPhone());

		return repository.save(userDB);
	}
}