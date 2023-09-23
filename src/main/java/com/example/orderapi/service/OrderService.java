package com.example.orderapi.service;

import com.example.orderapi.model.Order;
import com.example.orderapi.repository.OrderItemRepository;
import com.example.orderapi.repository.OrderRepository;
import com.example.orderapi.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private OrderItemRepository orderItemRepository;
    private ShipmentRepository shipmentRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository , OrderItemRepository orderItemRepository, ShipmentRepository shipmentRepository){
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.shipmentRepository = shipmentRepository;
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public boolean validateOrder(Order order){
        // check [ coupon - stock - amount ]
        boolean validOrder = true;
    }

    public boolean createOrder(Order order){
        boolean validOrder = true;
        // Validate and process the order request
        // Calculate the order total
        // Create the order entity and save it to the database
        // Update product stock and validate coupons
        // Handle payment and notify users


        return validOrder;
    }

    public Order getOrderByCustomerEmail(String email){
        // Perform validation if needed
        // Retrieve the order from the database
        // Example: Optional<Order> order = orderRepository.findById(orderId);

        // Handle the case when the order is not found
        // Example: if (!order.isPresent()) {
        //             throw new ResourceNotFoundException("Order not found with ID: " + orderId);
        //          }

        // Return the order if found
        // Example: return order.get();
        return new Order();
    }

    public List<Order> getOrdersByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        // Perform validation if needed
        // Retrieve orders that match the customer ID and fall within the specified date range
        // Example: return orderRepository.findByCustomerIdAndOrderDateBetween(customerId, startDate, endDate);
        return new ArrayList<>();
    }
}
