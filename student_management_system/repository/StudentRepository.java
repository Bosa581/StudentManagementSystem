package com.example.student_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student_management_system.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{ //the backend operations for the student
    List<Student> findByEmail(String email);
}
