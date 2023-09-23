package com.example.orderapi.controller;

import com.example.orderapi.model.Order;
import com.example.orderapi.service.ExternalApiService;
import com.example.orderapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService orderService;
    private final ExternalApiService externalApiService;

    @Autowired
    public OrderController(OrderService orderService , ExternalApiService externalApiService){
        this.orderService = orderService;
        this.externalApiService = externalApiService;
    }


    // Endpoint for creating a new order
    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        boolean validOrder = orderService.createOrder(order);



        orderService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
