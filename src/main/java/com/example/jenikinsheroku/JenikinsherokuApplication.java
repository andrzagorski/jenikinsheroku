package com.example.jenikinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenikinsherokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenikinsherokuApplication.class, args);
    }
    @GetMapping
    public String get() {
        return "Hi, jenkins!";
    }

}
