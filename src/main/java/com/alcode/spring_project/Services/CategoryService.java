package com.alcode.spring_project.Services;

import com.alcode.spring_project.Entities.Category;
import com.alcode.spring_project.Entities.Order;
import com.alcode.spring_project.Repositories.CategoryRepository;
import com.alcode.spring_project.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

}
