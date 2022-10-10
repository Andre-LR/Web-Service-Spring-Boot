package com.andrerodrigues.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerodrigues.web.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}