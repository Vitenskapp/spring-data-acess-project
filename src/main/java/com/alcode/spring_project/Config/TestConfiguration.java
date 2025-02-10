package com.alcode.spring_project.Config;

import com.alcode.spring_project.Entities.Order;
import com.alcode.spring_project.Entities.User;
import com.alcode.spring_project.Repositories.OrderRepository;
import com.alcode.spring_project.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "999999888", "321654");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

    }

}
