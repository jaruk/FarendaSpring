package com.farenda.spring.tutorial.excludescan;

import org.springframework.stereotype.Service;

@Service
public class IncludedService {

    public IncludedService() {
        System.out.println("Instantiating " + getClass().getSimpleName());
    }
}