package com.example.Mentor_Mentee_Matching.controller;


import com.example.Mentor_Mentee_Matching.entity.Profile;
import com.example.Mentor_Mentee_Matching.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
        Profile savedProfile = profileRepository.save(profile);
        return new ResponseEntity<>(savedProfile, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Profile>> getAllProfiles() {
        return new ResponseEntity<>(profileRepository.findAll(), HttpStatus.OK);
    }
}
