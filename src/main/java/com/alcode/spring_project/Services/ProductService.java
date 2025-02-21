package com.alcode.spring_project.Services;

import com.alcode.spring_project.Entities.Product;
import com.alcode.spring_project.Repositories.CategoryRepository;
import com.alcode.spring_project.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

}
