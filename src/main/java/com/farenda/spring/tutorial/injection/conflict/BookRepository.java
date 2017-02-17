package com.farenda.spring.tutorial.injection.conflict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {
    @Autowired
    private Library library;


//    public BookRepository(Library library) {
//        this.library = library;
//    }

    // It's our local database ;-)
    private Map<Integer, String> books = new HashMap<>();

    {
        books.put(1, "Effective Java, 2nd edition");
        books.put(2, "Java Concurrency in Practice");
        books.put(3, "Spring in Action");
    }

    public String titleById(int id) {
        System.out.println("In a library: " + library.name());
        return books.get(id);
    }
}