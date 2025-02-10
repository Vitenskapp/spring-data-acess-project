package com.alcode.spring_project.Resources;

import com.alcode.spring_project.Entities.Order;
import com.alcode.spring_project.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderResources {

    @Autowired
    private OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orderList = orderService.findAll();

        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable Long id) {
        Optional<Order> order = orderService.findById(id);

        return ResponseEntity.ok().body(order);
    }

}
