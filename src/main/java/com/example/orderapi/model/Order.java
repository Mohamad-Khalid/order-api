package com.example.orderapi.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "couponName")
    private String couponName;
    @Column(name = "couponValue")
    private int couponValue;
    @Column(name = "storeId")
    private int storeId;
    @Column(name = "customerEmail")
    private String customerEmail;
    @Column(name = "orderDate")
    private Date orderDate;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
    @Column(name = "total")
    private double total;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Shipment shipment;

    public Order(){

    }
    public Order(int id, String couponName, int couponValue,
                 int storeId, String customerEmail,
                 Date orderDate, List<OrderItem> orderItems,
                 double total, Shipment shipment) {
        this.id = id;
        this.couponName = couponName;
        this.couponValue = couponValue;
        this.storeId = storeId;
        this.customerEmail = customerEmail;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.total = total;
        this.shipment = shipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(int couponValue) {
        this.couponValue = couponValue;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
