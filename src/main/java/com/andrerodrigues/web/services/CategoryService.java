package com.andrerodrigues.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerodrigues.web.entities.Category;
import com.andrerodrigues.web.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
    }
    
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}