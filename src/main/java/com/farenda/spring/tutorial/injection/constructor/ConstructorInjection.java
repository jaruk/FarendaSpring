package com.farenda.spring.tutorial.injection.constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // scan this package for Spring beans
public class ConstructorInjection {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConstructorInjection.class, args);

        // Get bean from the Spring Application Context:
        Library library = context.getBean(Library.class);

        System.out.println("Title 1: " + library.findBook(1));
        System.out.println("Title 2: " + library.findBook(2));
    }
}