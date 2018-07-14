package com.jpadjase.oauth2service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("/test")
    public String test() {
        return "TEST OAUTH";
    }
}