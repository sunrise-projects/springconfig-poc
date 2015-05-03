package com.springconfig.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springconfig.poc.service.Hello;
import com.springconfig.poc.service.impl.HelloImpl;


@Configuration
public class SpringConfig {
 
    @Bean(name="helloBean")
    public Hello helloWorld() {
        return new HelloImpl();
    }
 
}