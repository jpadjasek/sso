package com.jpadjasek.webserwer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
//@EnableOAuth2Sso
public class WebServerApp {
    public static void main(String[] args) {
        SpringApplication.run(WebServerApp.class, args);
    }
}
