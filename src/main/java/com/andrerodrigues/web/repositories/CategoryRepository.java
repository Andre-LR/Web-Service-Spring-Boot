package com.andrerodrigues.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerodrigues.web.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}