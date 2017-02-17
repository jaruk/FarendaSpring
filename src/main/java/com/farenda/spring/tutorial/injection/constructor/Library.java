package com.farenda.spring.tutorial.injection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {


    private BookRepository bookRepository;

    @Autowired
    public Library(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String findBook(int id) {
        return bookRepository.titleById(id);
    }
}
