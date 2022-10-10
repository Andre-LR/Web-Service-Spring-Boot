package com.andrerodrigues.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerodrigues.web.entities.Category;
import com.andrerodrigues.web.services.CategoryService;

@RestController
@RequestMapping(value = "/Categories")
public class CategoryResource {

	@Autowired 
	private CategoryService service;

	
	 // GET /Categorys
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	// GET /Categories/{id}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}