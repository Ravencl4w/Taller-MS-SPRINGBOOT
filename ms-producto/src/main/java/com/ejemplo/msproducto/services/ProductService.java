package com.ejemplo.msproducto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.msproducto.models.Product;
import com.ejemplo.msproducto.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pRepository;

    public Product create (Product product) {
        return pRepository.save(product);
    }

    public List<Product> getAllProducts() {
       return pRepository.findAll();
    }

   public void delete (Product product) {
    pRepository.delete(product);
   }
}
