package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/roles/admin")
    public String RoleAdmin(){
        return "Your are admin";
    }

    @GetMapping("/roles/user")
    public String RoleUser(){
        return "Your are every one an user";
    }
}
