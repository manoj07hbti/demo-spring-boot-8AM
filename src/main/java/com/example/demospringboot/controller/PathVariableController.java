package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {


    @RequestMapping("/welcome_msg/{name}")
    public String welcome(@PathVariable String name){

        return "Welcome to Path Variable : "+name;
    }


    @RequestMapping("/cube/{number}")
    public int makeCube(@PathVariable int number){

        return number*number*number;
    }


    @RequestMapping("/voting/{age}/{city}")
    public String vote(@PathVariable int age, @PathVariable String city){

        if(age>18 && city=="AGRA"){

            return "Eligible for voting in Agra....";
        }
        else {

            return "NOT Eligible for voting in Agra....";
        }
    }

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        int sum=a+b;

        return "Sum of given number is "+sum;
    }


}
