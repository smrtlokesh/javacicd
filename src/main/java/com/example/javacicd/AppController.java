package com.example.javacicd;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController{

    @GetMapping("/")
    public String sayHello() {
        return "Java CICD ";
    }
}