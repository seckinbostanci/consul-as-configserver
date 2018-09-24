package com.seckinbostanci.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@Configuration
@RefreshScope
public class DemoController {

    @Value("${cassandra.host}")
    private String cassandraHost;

    @Value("${cassandra.user}")
    private String userName;

    @Value("${cassandra.password}")
    private String password;

    @Autowired
    private DemoConfiguration configuration;

    @PostConstruct
    public void postConstruct() {
        // to validate if properties are loaded
        System.out.println("** cassandra.host: " + cassandraHost);
        System.out.println("** cassandra.user: " + userName);
        System.out.println("** cassandra.password: " + password);
    }

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoConfiguration getConfiguration() {
        return configuration;
    }

}
