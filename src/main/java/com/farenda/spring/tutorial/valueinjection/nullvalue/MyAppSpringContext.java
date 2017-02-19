package com.farenda.spring.tutorial.valueinjection.nullvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@EnableAutoConfiguration
// Parameters can be passed from command line:
// --owner=Farenda --open=true
// or loaded from properties like so:
//@PropertySource("classpath:my-app.properties")
public class MyAppSpringContext {

    @Service
    public static class BookService {

        @Value("${owner:#{null}}")
        private String owner;

        @Value("${open:false}")
        private boolean open;

        public String getOwner() {
            return owner != null ? owner : "No owner";
        }

        public boolean isOpen() {
            return open;
        }
    }

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(MyAppSpringContext.class, args);
        BookService bookService = context.getBean(BookService.class);
        System.out.printf("Book Service owner: %s, is open: %b%n",
                bookService.getOwner(), bookService.isOpen());
    }
}