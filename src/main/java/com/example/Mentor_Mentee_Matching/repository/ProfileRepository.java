package com.example.Mentor_Mentee_Matching.repository;


import com.example.Mentor_Mentee_Matching.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

