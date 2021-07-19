package com.shop.services.order.service.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * An entity to store information about product.
 */

@Entity
@Table(name = "products")
public class Product {

    public Product(){}

    public Product(Double price, String size, Integer weight) {
        this.price = price;
        this.size = size;
        this.weight = weight;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double price;

    private String size;

    private Integer weight;



}
