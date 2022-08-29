package com.example.demomysql.service;

import com.example.demomysql.Student.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpa();
    Student saveOrUpdateStudent(Student student);
    void deleteStudentById(String id);
}
