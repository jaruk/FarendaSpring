

package com.farenda.spring.tutorial.injection.constructor;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements BookRepository {

    // It's our local database ;-)
    private Map<Integer, String> books = new HashMap<>();

    {
        books.put(1, "Effective Java, 2nd edition");
        books.put(2, "Java Concurrency in Practice");
        books.put(3, "Spring in Action");
    }

    @Override
    public String titleById(int id) {
        return books.get(id);
    }
}
