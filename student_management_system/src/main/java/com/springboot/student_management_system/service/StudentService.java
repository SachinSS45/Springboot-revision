package com.springboot.student_management_system.service;

import com.springboot.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
    Student updateStudent(Long id,Student student);
    Student patchStudent(Long id,Student student);
}
