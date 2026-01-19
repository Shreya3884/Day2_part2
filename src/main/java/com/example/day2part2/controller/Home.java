package com.example.day2part2.controller;
import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Home {
    @GetMapping("/about")
    public String home(){
        return "this is all about home page";
    }
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student= new StudentModel(1,"shreya","jainjdh");
        return student;
    }
}



