package com.alcode.spring_project.Resources;

import com.alcode.spring_project.Entities.Category;
import com.alcode.spring_project.Entities.Product;
import com.alcode.spring_project.Services.CategoryService;
import com.alcode.spring_project.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResources {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> findAll() {
        List<Product> productList = productService.findAll();

        return ResponseEntity.ok().body(productList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
        Optional<Product> product = productService.findById(id);

        return ResponseEntity.ok().body(product);
    }

}
