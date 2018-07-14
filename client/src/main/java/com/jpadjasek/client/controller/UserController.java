package com.jpadjasek.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/test")
    public String user() {
        return "DUPKA JEST";
    }
}