package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcontroller {
    @GetMapping("/api/Health")

    public String Health(){
        return "Chatrooom Backens is running";
    }


}
