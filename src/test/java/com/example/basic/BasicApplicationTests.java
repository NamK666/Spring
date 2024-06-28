package com.example.basic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(BasicApplicationTests.class, args);

    }

}
