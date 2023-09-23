package com.example.orderapi.repository;

import com.example.orderapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByCustomerEmail(String customerEmail);

    List<Order> findByOrderDateBetween(LocalDateTime startDate, LocalDateTime endDate);

}
