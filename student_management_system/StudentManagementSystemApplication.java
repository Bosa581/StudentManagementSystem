package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	// automatically  injects my student repositiory to prevent nullpointer exception 
	private StudentRepository studentRepository;

	@Override
    public void run(String... args){
        Student student1 = new Student("Bosa", "Igbinovia", "orobosa581@gmail.com");
    	studentRepository.save(student1);
    }

}
