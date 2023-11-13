package com.example.test_rest_lr.dao;

import com. example.test_rest_lr.entity.Student; import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
    public interface StudentDAO{

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deletestudent(int id);
}
