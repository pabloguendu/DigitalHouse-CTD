package com.example.finalB1.finalB1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String home(){
        return "Bienvenido";
    }

    @GetMapping("/user")
    public String user(){
        return "Bievenido Usuario";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Bienvenido Admin";
    }

}
