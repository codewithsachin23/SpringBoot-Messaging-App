package com.controllers;

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

}
