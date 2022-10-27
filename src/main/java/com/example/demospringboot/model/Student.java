package com.example.demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_8AM_AUGUST")  // STEP 1
public class Student {

    @Id  // it make this column as primary key
    @GeneratedValue  // STEP 2 Automatically database will increase this value and use it
    long id;

    String name;
    @Column(name = "STD_AGE") // if we want to change name of column
    int age;
    String section;

    //STEP 3 Default Constructor

    public Student() {
    }


    // parameterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    // getter and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
