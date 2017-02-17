package com.farenda.spring.tutorial.injection.conflict;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class InjectionConflict {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(InjectionConflict.class, args);

        Library library = context.getBean(Library.class);

        System.out.println("Title 2: " + library.findBook(2));
    }
}