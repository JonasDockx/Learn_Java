package com.jonas.demo;

import org.springframework.stereotype.Component;

// @Component tells Spring: "create and manage one of these for me."
// Spring will hand it out wherever a MessageSender is needed.
@Component
public class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
