package com.alcode.spring_project.Services;

import com.alcode.spring_project.Entities.Order;
import com.alcode.spring_project.Entities.User;
import com.alcode.spring_project.Repositories.OrderRepository;
import com.alcode.spring_project.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

}
