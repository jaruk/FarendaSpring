package com.farenda.spring.tutorial.excludescan;

import org.springframework.stereotype.Service;

@Service
public class ExcludedService {

    public ExcludedService() {
        System.out.println("Instantiating " + getClass().getSimpleName());
    }
}