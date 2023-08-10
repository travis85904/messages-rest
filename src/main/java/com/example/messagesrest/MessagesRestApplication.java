package com.example.messagesrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagesRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagesRestApplication.class, args);
    }

}
