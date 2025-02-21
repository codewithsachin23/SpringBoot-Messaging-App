package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLab";
    }
    @GetMapping("Hello/{name}")
    public String hello3(@PathVariable String name) {
        return "Hello "+ name +" from BridgeLab";
    }


    }
}
