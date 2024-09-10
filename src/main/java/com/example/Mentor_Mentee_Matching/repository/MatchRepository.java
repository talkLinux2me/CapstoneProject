package com.example.Mentor_Mentee_Matching.repository;

import com.example.Mentor_Mentee_Matching.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}

