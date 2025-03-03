package com.example.SpringBoot.Database.services;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    String message;

    GreetingService(){
        message = "Hello World!";
    }

    public String getGreetings(){
        return this.message;
    }

}
