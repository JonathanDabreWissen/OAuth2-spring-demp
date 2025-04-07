package com.oauth.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
