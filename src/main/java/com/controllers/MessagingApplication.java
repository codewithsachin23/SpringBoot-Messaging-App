package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {


    @GetMapping("/q")
    public String hello2(@RequestParam String name) {
        return "Hello "+ name +" from BridgeLab";
    }

}
