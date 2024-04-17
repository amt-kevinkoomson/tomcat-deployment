package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final long startTime = System.currentTimeMillis();
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public String healthCheck(){
        long uptime = (System.currentTimeMillis() - startTime)/1000;
        return "Service running for " + uptime;
    }
}
