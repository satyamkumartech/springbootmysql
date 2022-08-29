package com.example.demomysql.repository;

import com.example.demomysql.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpa();
}
