package com.springboot.student_management_system.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students") //It will be table to database
public class Student {

    @Id //primary key : for unique identification
    @GeneratedValue(strategy = GenerationType.IDENTITY) //We will not add value manually it should generate automatically
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String course;
}
