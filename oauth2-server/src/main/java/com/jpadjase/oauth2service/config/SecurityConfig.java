package com.jpadjase.oauth2service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin().permitAll().and()
                .authorizeRequests()
                .antMatchers("/", "/login**", "/oauth/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();

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
                .authorities("user")
                .roles("read", "write");
    } // @formatter:on

}