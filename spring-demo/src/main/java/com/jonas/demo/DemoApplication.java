package com.jonas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication marks the entry point. It tells Spring to start its
// "container" and scan this package (and sub-packages) for your components.
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);   // boot Spring
    }
}
