package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(123, "test");
    }


}
