package ru.ostarkov.testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ostarkov.testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
