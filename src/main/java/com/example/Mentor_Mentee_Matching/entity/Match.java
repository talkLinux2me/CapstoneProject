package com.example.Mentor_Mentee_Matching.entity;


import jakarta.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User mentor;

    @ManyToOne
    private User mentee;

    // Getters and Setters
}
