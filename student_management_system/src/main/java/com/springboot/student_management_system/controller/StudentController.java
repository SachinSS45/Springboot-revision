package com.springboot.student_management_system.controller;

import com.springboot.student_management_system.entity.Student;
import com.springboot.student_management_system.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    //http://localhost:8080/students/hello
    //Get All Students
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //Get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
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
        studentService.deleteStudentById(id);
        return "Student deleted with id : " + id;
    }
}
