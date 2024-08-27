package com.example.student_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.service.StudentService;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle the list student and return mode and view //return the mode and the view cause its the controller
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudent());  //this list of student will be displayed in the html in an html table
        return "students"; //returns the view
    }

    //handler method for add student button
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //student objec tot hold student form data
        Student student  = new Student();
        model.addAttribute("student", student); //like  a hash map, the key being the string literal and the value being the student
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
            @ModelAttribute("student") Student student,
            Model model){

            //get student's id form the data base
            Student existingStudent = studentService.getStudentById(id);
            existingStudent.setId(id);
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());

            //SAVE updated object
            studentService.updateStudent(existingStudent);
            return "redirect:/students";

    }
    
    //handler for deleting the students button individually
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
