package com.seckinbostanci.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("demo")
@Data
public class DemoConfiguration {

    private String name;
    private String email;

}