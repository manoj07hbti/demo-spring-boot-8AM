package com.example.demospringboot.controller;

import com.example.demospringboot.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    //SYNTAX : @Autowired
    //         ClassName objName;

    @Autowired
    AppFlowService service;

    @RequestMapping("/app_flow")
    public String appFlow(){

        //AppFlowService obj= new AppFlowService();

        return  service.appFlow();
    }

}
