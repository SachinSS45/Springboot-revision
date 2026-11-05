package com.springboot.student_management_system.service;

import com.springboot.student_management_system.entity.Student;
import com.springboot.student_management_system.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if(existingStudent!=null){
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setCourse(student.getCourse());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    @Override
    public Student patchStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if(existingStudent!=null) {

            if (student.getFirstName() != null)
                existingStudent.setFirstName(student.getFirstName());

            if (student.getLastName() != null)
                existingStudent.setLastName(student.getLastName());

            if (student.getEmail() != null)
                existingStudent.setEmail(student.getEmail());

            if (student.getCourse() != null)
                existingStudent.setCourse(student.getCourse());

            return studentRepository.save(existingStudent);
        }
        return null;
    }
}
