package com.example.demospringboot.service;

import com.example.demospringboot.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;

    public String appFlow(){

        return  repository.appFLow();
    }
}
