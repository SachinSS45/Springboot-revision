package com.springboot.student_management_system.controller;

import com.springboot.student_management_system.entity.Student;
import com.springboot.student_management_system.repository.StudentRepository;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    //http://localhost:8080/students/hello
    //Get All Students
    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //Get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Student not found with id: " + id
                ));
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentRepository.save(student);
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
        studentRepository.deleteById(id);
        return "Student deleted with id : " + id;
    }
}
