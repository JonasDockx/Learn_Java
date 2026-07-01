package com.jonas.demo;

import org.springframework.stereotype.Service;

// @Service is @Component with a name that says "this holds business logic."
// Note: SAME constructor injection you wrote by hand — but no `new` anywhere.
// Spring sees the constructor needs a MessageSender and injects the EmailSender.
@Service
public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {   // Spring injects here
        this.sender = sender;
    }

    public void alert(String message) {
        sender.send(message);
    }
}
