package com.louracodes.Springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String helloWorld() {
        return "welcome to louraCodes !";
    }
}
