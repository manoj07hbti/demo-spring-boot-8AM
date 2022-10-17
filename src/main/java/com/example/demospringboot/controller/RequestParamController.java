package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){

        return "Welcome to Request param of Spring Boot "+name;
    }

    @RequestMapping("/names")
    public String twoInput(@RequestParam String name1, @RequestParam String name2){

        return name1 + " and " + name2;
    }

    @RequestMapping("/add_param")
    public String add(@RequestParam int a,@RequestParam int b){

        return "Addition of a and b is "+(a+b);
    }

}
