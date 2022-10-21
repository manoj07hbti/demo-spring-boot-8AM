package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCRUDController {

    ArrayList<Student> studentArrayList= new ArrayList<>();


    // C-CREATE OR ADD
    @RequestMapping(value = "/add_std" , method = RequestMethod.POST)
    public String add(){

        Student student= new Student("Rahul",21,"CS");
        studentArrayList.add(student);

        return "Successfully Added Student ";
    }

    //READ or GET

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

    //UPDATE

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(@RequestParam int index,@RequestParam String name){

       Student student= studentArrayList.get(index);
       student.setName(name);

       return "Successfully updated name as "+name;
    }

    //DELETE
    @RequestMapping(value = "/remove/{index}", method = RequestMethod.DELETE)
    public String remove(@PathVariable int index){

        studentArrayList.remove(index);

        return "Successfully removed ";
    }

}
