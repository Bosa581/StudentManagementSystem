package com.example.student_management_system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.repository.StudentRepository;
import com.example.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
 
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll(); //returns a list of student
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
       return studentRepository.findById(id).get();
    }



    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }



    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
