package com.example.demospringboot.service;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    //CREATE OR INSERT
    public String add(Student student){

      repository.save(student);// insert to db

      return "Successfully Saved to Database";
    }

    public List<Student> getAll(){

      return repository.findAll();// select * from student

    }

    public String update(long id, String name){

        //STEP 1
       Student student= repository.getById(id); // it will trigger select * from table where id="id"

        //STEP 2

        student.setName(name);
        repository.save(student);// insert the data with modified name

        return "Successfully Updated name as "+name;
    }


    public String delete(long id){

        repository.deleteById(id);// delete from table id="id"

      return "Successfully deleted ";
    }
}
