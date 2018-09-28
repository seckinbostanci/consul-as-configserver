package com.seckinbostanci.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${spring.datasource.url}")
    private String theURL;

    @GetMapping(value = "/demo")
    public String theDemo(){
        return "THE URL : " + theURL;
    }

}
