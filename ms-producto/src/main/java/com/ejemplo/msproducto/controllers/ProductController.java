package com.ejemplo.msproducto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.msproducto.models.Product;
import com.ejemplo.msproducto.services.ProductService;



@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService pService;

    public ResponseEntity<List<Product>> listAll() {
        return ResponseEntity.ok(pService.getAllProducts());
    }
    
}
