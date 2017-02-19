package com.farenda.spring.tutorial.valueinjection.defaultvalue;

import org.springframework.stereotype.Component;

@Component("defaults")
public class Defaults {
    public String getHostname() {
        return "default.host";
    }
}
