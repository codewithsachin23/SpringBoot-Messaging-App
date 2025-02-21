package com.controllers;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


import com.model.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {
    @PostMapping("/post")
    public String hello4(@RequestBody UserDTO user) {
        return "Hello "+ user.getFirstName() + " " + user.getLastName() +" from BridgeLab";

    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLab";
    }
    @GetMapping("Hello/{name}")
    public String hello3(@PathVariable String name) {
        return "Hello "+ name +" from BridgeLab";
    }


    }

