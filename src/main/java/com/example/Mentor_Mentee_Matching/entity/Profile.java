package com.example.Mentor_Mentee_Matching.entity;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String name;
    private String email;
    private String expertise;
    private String interests;

    // Getters and Setters
}
