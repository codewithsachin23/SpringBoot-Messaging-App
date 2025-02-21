package com.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {
    @PutMapping("Hello/{firstName}")
    public String hello5(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello "+ firstName + " " + lastName +" from BridgeLab";
    }

}
