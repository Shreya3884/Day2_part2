package com.example.day2part2.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Home {
    @GetMapping("/about")
    public String home(){
        return "this is all about home page";
    }
}



