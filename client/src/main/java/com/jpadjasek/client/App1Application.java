package com.jpadjasek.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class App1Application {

    public static void main(String[] args) {
        SpringApplication.run(App1Application.class, args);
    }
}