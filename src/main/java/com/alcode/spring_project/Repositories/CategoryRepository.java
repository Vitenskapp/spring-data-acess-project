package com.alcode.spring_project.Repositories;

import com.alcode.spring_project.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
