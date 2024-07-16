package com.example.service;

import com.example.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private Helper helper;

    public String hello() {
        System.out.println(this.helper);
        return "hello, Spring Boot!";
    }
}
