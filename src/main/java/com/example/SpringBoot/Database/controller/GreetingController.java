package com.example.SpringBoot.Database.controller;
import com.example.SpringBoot.Database.dto.MessageDTO;
import org.springframework.web.bind.annotation.*;
import com.example.SpringBoot.Database.services.GreetingService;

@RestController
@RequestMapping("greetings")
public class GreetingController {

    //---------------UC1--------------------

    @GetMapping("/get")
    public String getGreetings(){
        return "{\"message\": \"Hello from GET Request!\"}";
    }

    @PostMapping("/post")
    public String postGreetings(@RequestBody MessageDTO message){
        return "{\""+message.getMessage()+": \"Hello from POST Request!\"}";
    }

    @PutMapping("/put/{message}")
    public String putGreetings(@PathVariable String message){
        return "{\""+message+": \"Hello from PUT Request!\"}";
    }

    //---------------------UC2-------------------

    GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/service")
    public String serviceGreetings(){
        return greetingService.getGreetings();
    }

}