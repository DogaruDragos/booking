package com.challenge.booking.service;


import jakarta.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class Service {


    @PostConstruct
    void init(){
        System.out.println("The service was initialized");
    }


}
