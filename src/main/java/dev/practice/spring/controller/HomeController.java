package dev.practice.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    //Get
    @GetMapping("/")
    public String index(){
        return "Hello Spring & Spring Boot";
    }
    
}
