package com.farenda.spring.tutorial.valueinjection.defaultvalue;

import com.farenda.spring.tutorial.valueinjection.nullvalue.MyAppSpringContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SampleSpringComponent {

    @Value("${hostname : localhost}")
    private String hostName;

    @Value("${target.dir : #{systemProperties['java.io.tmpdir']}}")
    private String dir;


    @Value("#{systemProperties['java.user.home'] ?: '/tmp/default'}")
    private String spelDir;

    public String getHostName() {
        return hostName;
    }

    public String getDir() {
        return dir;
    }



    public String getSpelDir() {
        return spelDir;
    }

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SampleSpringComponent.class, args);
        SampleSpringComponent sampleSpringComponent = context.getBean(SampleSpringComponent.class);
        System.out.printf("Host name: %s", sampleSpringComponent.getHostName());
    }
}
