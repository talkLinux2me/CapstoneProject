package com.example.Mentor_Mentee_Matching.repository;


import com.example.Mentor_Mentee_Matching.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
