package com.example.mywebapp.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage() {
        return "Hello from My Web App!";
    }
}

