package com.alcode.spring_project.Repositories;

import com.alcode.spring_project.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
