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

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Long id,@RequestBody String student){
        return "Student with id " + id + " updated successfully";
    }

    @PatchMapping("/{id}")
    public String patchStudent(@PathVariable Long id,
                               @RequestBody String email){
        return "Student email updated for id "+id;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        return "Student with id : " + id + " deleted successfully";
    }
}
