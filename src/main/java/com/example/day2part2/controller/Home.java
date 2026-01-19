package com.example.day2part2.controller;
import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/about")
    public String home(){
        return "this is all about home page";
    }
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> student= new ArrayList<>();
         student.add(new StudentModel(1,"shreya","shreyagmail.com"));
        student.add(new StudentModel(1,"jahnvi","jahnvigmail.com"));
        student.add(new StudentModel(1,"mani","manigmail.com"));
        student.add(new StudentModel(1,"suhani","suhanigmail.com"));
        student.add(new StudentModel(1,"shre","shregmail.com"));
                return student;
    }

}



