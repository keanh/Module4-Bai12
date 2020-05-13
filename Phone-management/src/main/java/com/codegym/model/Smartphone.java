package com.codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String producer;
    private String model;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
