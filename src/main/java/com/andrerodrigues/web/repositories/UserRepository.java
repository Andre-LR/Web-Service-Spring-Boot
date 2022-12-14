package com.andrerodrigues.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerodrigues.web.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}