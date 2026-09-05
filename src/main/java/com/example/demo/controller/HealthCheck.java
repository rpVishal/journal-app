package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck() {
return "Health check successful!";    }

}
