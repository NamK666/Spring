package com.example.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {
        UserRepositoryInterface userRepository = new UserRepository();
        UserRepositoryInterface userRepository2 = new UserRepository2();

        new UserService(userRepository);
        new UserService(userRepository2);

        SpringApplication.run(BasicApplication.class, args);
    }

}