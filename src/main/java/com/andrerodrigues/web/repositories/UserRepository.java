package com.andrerodrigues.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andrerodrigues.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}