package com.jpadjase.oauth2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableResourceServer
//@EnableZuulProxy
//@EnableOAuth2Resource
@EnableAuthorizationServer
public class Oauth2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }

}