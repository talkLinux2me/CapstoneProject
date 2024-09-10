package com.example.Mentor_Mentee_Matching.controller;

import com.example.Mentor_Mentee_Matching.entity.Message;
import com.example.Mentor_Mentee_Matching.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message savedMessage = messageRepository.save(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Message>> getAllMessages() {
        return new ResponseEntity<>(messageRepository.findAll(), HttpStatus.OK);
    }
}

