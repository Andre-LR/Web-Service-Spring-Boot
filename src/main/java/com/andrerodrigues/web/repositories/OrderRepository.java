package com.andrerodrigues.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerodrigues.web.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}