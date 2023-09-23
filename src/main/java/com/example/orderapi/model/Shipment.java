package com.example.orderapi.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @Column(name = "street")
    private String  street;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "status")
    private String status;
    @Column(name = "deliveryDate")
    private Date deliveryDate;

    public Shipment(){}

    public Shipment(int id, Order order, String street, String city, String country, String status, Date deliveryDate) {
        this.id = id;
        this.order = order;
        this.street = street;
        this.city = city;
        this.country = country;
        this.status = status;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
