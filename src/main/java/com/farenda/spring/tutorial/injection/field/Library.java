package com.farenda.spring.tutorial.injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    @Autowired
    private BookRepository bookRepository;


    public String findBook(int id) {
        return bookRepository.titleById(id);
    }
}
