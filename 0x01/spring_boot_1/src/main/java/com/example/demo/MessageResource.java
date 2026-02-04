package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageResource {

    // Step C: simpleMessageWelcome microservice
    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "WELCOME TO THE MICRO-SERVICE CLASS USING SPRING BOOT!!!";
    }

    // Step E: login microservice
    @GetMapping("/login")
    public String login(
            @RequestParam(required = false) String user,
            @RequestParam(required = false) String password
    ) {
        // Check if user or password is missing
        if (user == null || user.isEmpty() || password == null || password.isEmpty()) {
            return "USER AND PASSWORD NOT PROVIDED";
        }

        // Check if user or password is too long
        if (user.length() > 15 || password.length() > 15) {
            return "USER AND PASSWORD INVALID";
        }

        // Successful login
        return "LOGIN SUCCESSFUL!!!";
    }
}

