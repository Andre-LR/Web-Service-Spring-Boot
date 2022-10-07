package com.andrerodrigues.web.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerodrigues.web.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u1 = new User(1, "Maria", "maria@gmail.com", "9999999", "992345982");
		return ResponseEntity.ok().body(u1);
	}
}