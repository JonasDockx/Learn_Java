package com.jonas.demo;

// The same abstraction you wrote by hand — an interface Spring will inject.
public interface MessageSender {
    void send(String message);
}
