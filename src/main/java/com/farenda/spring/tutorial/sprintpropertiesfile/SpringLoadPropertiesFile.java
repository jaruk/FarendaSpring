package com.farenda.spring.tutorial.sprintpropertiesfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@PropertySource(
        // can be: classpath, classpath*, file:
        value = "classpath:my-app.properties"
        // Since Spring 4.0 - easies working with optional properties:
        //ignoreResourceNotFound = true
)
public class SpringLoadPropertiesFile {

    @Value("${databaseName}")
    private String databaseName;

    @Value("${connectionTimeout}")
    private long connectionTimeout;

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringLoadPropertiesFile.class, args);

        SpringLoadPropertiesFile bean =
                context.getBean(SpringLoadPropertiesFile.class);

        System.out.printf("Database name: %s, connection timeout: %d%n",
                bean.databaseName, bean.connectionTimeout);
    }
}