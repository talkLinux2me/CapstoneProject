package com.example.Mentor_Mentee_Matching.controller;


import com.example.Mentor_Mentee_Matching.entity.Match;
import com.example.Mentor_Mentee_Matching.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    @PostMapping
    public ResponseEntity<Match> createMatch(@RequestBody Match match) {
        Match savedMatch = matchRepository.save(match);
        return new ResponseEntity<>(savedMatch, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Match>> getAllMatches() {
        return new ResponseEntity<>(matchRepository.findAll(), HttpStatus.OK);
    }
}
