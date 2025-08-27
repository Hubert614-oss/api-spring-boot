package com.gv.shop.api.model;

import jakarta.persistence.*;

// @SuppressWarnings("unused")
@Entity()
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String promotion;
}