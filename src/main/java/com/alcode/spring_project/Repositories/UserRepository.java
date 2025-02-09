package com.alcode.spring_project.Repositories;

import com.alcode.spring_project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
