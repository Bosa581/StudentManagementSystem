package com.example.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Bosa", "Igbinovia", "orobosa581@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Lire", "Smith", "Lsmith@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Lore", "Parker", "Lparker@gmail.com");
		studentRepository.save(student3);*/
	}

}
