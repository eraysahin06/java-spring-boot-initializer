package com.example.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    @RequestMapping("/")
    public String GetGreeting() {
        return "Java Spring-Boot Test";
    }

    @RequestMapping("/java")
    public String javaGET() {
        return "Spring Initializer Test.";
    }

}
