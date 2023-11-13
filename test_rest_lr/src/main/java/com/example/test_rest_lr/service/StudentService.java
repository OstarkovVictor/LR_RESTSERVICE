package com.example.test_rest_lr.service;

import org.springframework.stereotype.Service;
import com.example.test_rest_lr.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    boolean deleteStudent(int id);
}