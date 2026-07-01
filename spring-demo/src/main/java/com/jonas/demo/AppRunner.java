package com.jonas.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// A CommandLineRunner's run() executes once, right after Spring finishes starting.
// We use it just to prove the wiring worked — no `new` calls anywhere in our code.
@Component
public class AppRunner implements CommandLineRunner {
    private final NotificationService service;

    public AppRunner(NotificationService service) {   // Spring injects the service
        this.service = service;
    }

    public void run(String... args) {
        service.alert("Hello from Spring");
    }
}
