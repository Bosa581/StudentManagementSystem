package com.example.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_management_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{ //the backend operations for the student

}
