package com.example.SpringBoot.Database.services;

import com.example.SpringBoot.Database.dto.MessageDTO;
import com.example.SpringBoot.Database.entities.MessageEntity;
import com.example.SpringBoot.Database.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreetingService {

    String message;
    GreetingRepository greetingRepository;

    GreetingService(){
        message = "Hello World!";
    }

    public String getGreetings(){
        return this.message;
    }

    public MessageDTO saveMessage(MessageDTO message){

        MessageEntity me = new MessageEntity(message.getMessage());

        greetingRepository.save(me);

        MessageDTO dto = new MessageDTO(me.getMessage());

        dto.setId(me.getId());

        return dto;
    }

}
