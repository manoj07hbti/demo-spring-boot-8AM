package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

// ENDPOINT @RequestMapping("/endpoint_name")

    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello, Welcome to Spring Boot ");
    }


    @RequestMapping("/welcome")
    public String welcome(){

        String str="Welcome to Spring Boot Tutorial.....";

        return str;
    }


    @RequestMapping("/sum")
    public String  add(){

        int a=5;
        int b=6;
        int sum=a+b;

        return "SUM of two number is: "+sum;
    }


    @RequestMapping("/course")
    public ArrayList<String> list(){

        ArrayList<String > course=new ArrayList<>();
        course.add("Microservices");
        course.add("Spring Boot");
        course.add("Java");

      return course;
    }

}
