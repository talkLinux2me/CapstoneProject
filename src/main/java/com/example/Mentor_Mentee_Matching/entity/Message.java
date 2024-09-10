package com.example.Mentor_Mentee_Matching.entity;

import jakarta.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Match match;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    private String message;
    private String timestamp;

    // Getters and Setters
}
