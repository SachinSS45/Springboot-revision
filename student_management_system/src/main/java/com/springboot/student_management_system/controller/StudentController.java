package com.springboot.student_management_system.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    //http://localhost:8080/students/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Student Management System";
    }

    @PostMapping("/student")
    public String saveStudent(@RequestBody String student){
        return "Student saved successfully";
    }
}
