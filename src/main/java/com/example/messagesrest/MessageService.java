package com.example.messagesrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.Instant;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessagesRepository messagesRepository;

    public List<Message> allMessages() {return messagesRepository.findAll();}

    @PostMapping
    public Message createMessage(String sender, String recipient, String messageBody) {
        return messagesRepository.insert(new Message(sender,recipient,messageBody, Instant.now()));
    }

    //public Optional<List<Message>> getAllMessagesBySender(String sender){return messagesRepository.allMessagesBySender(sender);}
}
