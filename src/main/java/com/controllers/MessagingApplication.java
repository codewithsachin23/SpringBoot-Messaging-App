package com.controllers;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


import com.model.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {


    @PostMapping("/post")
    public String hello4(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLab";

    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLab";
    }

    @GetMapping("Hello/{name}")
    public String hello3(@PathVariable String name) {
        return "Hello " + name + " from BridgeLab";
    }




    @PutMapping("Hello/{firstName}")
    public String hello5(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLab";

    }
}
