package com.gv.shop.api.controller;

import com.gv.shop.api.model.ProductModel;
import com.gv.shop.api.repository.ProductRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductModel> getAll() {
        return productRepository.findAll();
    }

}