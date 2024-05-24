package com.crm.testmicroservice3.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageConsumerController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/say")
    public String getMethodName() {
        return "Hi, I am from Microservice " + serverPort;
    }
}
