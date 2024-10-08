package com.mrw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Định nghĩa một endpoint đơn giản trả về "Hello"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}