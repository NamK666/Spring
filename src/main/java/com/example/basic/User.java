package com.example.basic;

import org.springframework.boot.SpringApplication;

public class User {
    public static void main(String[] args) {

        UserRepositoryInterface userRepository = new UserRepository();

        SpringApplication.run(BasicApplication.class, args);

    }
}
