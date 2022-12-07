package com.example.demo;


import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
    
    @GetMapping("/")
    public String home() {
        return "long";
    }


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(String name) {
        System.out.println(name);
        return "Hello, " + name + "!";
    }

}
