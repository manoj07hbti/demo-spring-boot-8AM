package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {


    @RequestMapping("/student")
    public Student studentInfo(){

        Student student= new Student("Raj",21,"CS");

        return student;
    }


    @RequestMapping("/student_list")
    public ArrayList<Student> getStudentList(){

        ArrayList<Student> students= new ArrayList<>();
        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rahul",20,"IT");
        Student student3= new Student("Mukesh",22,"CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

}
