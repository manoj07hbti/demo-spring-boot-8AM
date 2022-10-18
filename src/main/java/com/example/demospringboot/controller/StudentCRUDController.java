package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCRUDController {

    ArrayList<Student> studentArrayList= new ArrayList<>();


    // C-CREATE OR ADD
    @RequestMapping("/add_std")
    public String add(){

        Student student= new Student("Rahul",21,"CS");
        studentArrayList.add(student);

        return "Successfully Added Student ";
    }

    //READ or GET

    @RequestMapping("/students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

    //UPDATE

    @RequestMapping("/update")
    public String update(@RequestParam int index,@RequestParam String name){

       Student student= studentArrayList.get(index);
       student.setName(name);

       return "Successfully updated name as "+name;
    }

    //DELETE
    @RequestMapping("/remove/{index}")
    public String remove(@PathVariable int index){

        studentArrayList.remove(index);

        return "Successfully removed ";
    }

}
