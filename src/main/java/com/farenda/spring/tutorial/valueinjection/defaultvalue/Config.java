package com.farenda.spring.tutorial.valueinjection.defaultvalue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class Config {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        // Needed by Spring to resolve ${} inside @Value:
        return new PropertySourcesPlaceholderConfigurer();
    }
}
