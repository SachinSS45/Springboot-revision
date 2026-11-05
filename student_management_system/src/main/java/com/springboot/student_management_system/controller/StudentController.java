package com.springboot.student_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    //http://localhost:8080/students/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Student Management System";
    }
}
