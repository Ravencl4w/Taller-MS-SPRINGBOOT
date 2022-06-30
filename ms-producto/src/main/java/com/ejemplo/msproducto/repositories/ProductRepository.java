package com.ejemplo.msproducto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.msproducto.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
