package com.alcode.spring_project.Config;

import com.alcode.spring_project.Entities.User;
import com.alcode.spring_project.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "999999888", "321654");

        userRepository.saveAll(Arrays.asList(user1, user2));

    }

}
