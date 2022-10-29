package com.example.demospringboot.controller;


import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;

    //C- create or insert

    @PostMapping("/add_student_db") // @RequestMapping(value = "/add_student_db" , method = RequestMethod.POST)
    public String add(@RequestBody Student student){

       return service.add(student);
    }

    //READ

    @GetMapping("/get_all_db") //@RequestMapping(value = "/get_all_db", method = RequestMethod.GET)
    public List<Student> getAll(){

        return service.getAll();
    }

    //UPDATE

    @PutMapping("/update_std_db")// @RequestMapping(value = "/update_std_db", method = RequestMethod.PUT)
    public String update(@RequestParam long id, @RequestParam String name){

      return service.update(id,name);
    }

    //DELETE

    @DeleteMapping("/delete_std_db/{id}")//@RequestMapping(value = "/delete_std_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id){

       return service.delete(id);
    }

}
