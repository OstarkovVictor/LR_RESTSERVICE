package com.example.test_rest_lr.dao;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Query;
import com.example.test_rest_lr.entity.Student;

import java.util.List;

@Slf4j
@Repository
public class StudentDAOImpl implements StudentDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Student> getAllStudents(){
        Query query = entityManager.createQuery( "from Student");
        List<Student> allStudents = query.getResultList();
        log.info ("getAllStudents" + allStudents);
        return allStudents;}
    @Override
    public Student saveStudent(Student student){ return entityManager.merge(student);}
    @Override
    public Student getStudent(int id){
    return entityManager.find(Student.class, id);}
    @Override
    public void deletestudent(int id){
    Query query = entityManager.createQuery( "delete from Student "+" where id =:studentId");
        query.setParameter(  "studentId", id);
        query.executeUpdate();}}