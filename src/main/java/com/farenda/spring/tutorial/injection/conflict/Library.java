package com.farenda.spring.tutorial.injection.conflict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
    @Autowired
    private BookRepository bookRepository;


//    public Library(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public String findBook(int id) {
        return bookRepository.titleById(id);
    }

    public String name() {
        return "Public library #1";
    }
}