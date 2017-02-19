package com.farenda.spring.tutorial.excludescan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

import java.util.Arrays;

@ComponentScan(basePackages = "com.farenda.spring.tutorial.excludescan",
        excludeFilters =@Filter(
                type = FilterType.REGEX,
                pattern = "com\\.farenda\\.spring\\.tutorial\\.excludescan\\.Excluded.*"))
@EnableAutoConfiguration
public class ExcludingFromComponentScanExample {

    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                SpringApplication.run(ExcludingFromComponentScanExample.class, args);

        String[] beans = context.getBeanDefinitionNames();

        // sort names only to make output more readable:
        Arrays.sort(beans);

        System.out.println("Defined beans: ");
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}