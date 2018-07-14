package com.jpadjase.oauth2service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception { // @formatter:off
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login", "/oauth/authorize", "/oauth/confirm_access").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/")
                .and()
                .csrf()
                .disable();

/*        http.formLogin()
                .successForwardUrl("/loged")
                .permitAll()
                .and()
                .requestMatchers()
                .antMatchers( "/login", "/oauth/authorize")
                .and()
                .authorizeRequests()
                .antMatchers("/login")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .logout();*/


    } // @formatter:on

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { // @formatter:off
        auth.inMemoryAuthentication()
                .withUser("test")
                .password("test")
                .roles("USER");
    } // @formatter:on

}