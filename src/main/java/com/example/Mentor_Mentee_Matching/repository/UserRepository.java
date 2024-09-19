package com.example.Mentor_Mentee_Matching.repository;


import com.example.Mentor_Mentee_Matching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

