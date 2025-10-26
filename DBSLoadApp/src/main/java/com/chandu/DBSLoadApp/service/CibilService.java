package com.chandu.DBSLoadApp.service;



import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CibilService {

    /**
     * Simulates fetching the CIBIL score for a user.
     *
     * @param userId The ID of the user whose CIBIL score is to be fetched.
     * @return A random CIBIL score between 300 and 900.
     */
    public int getCibilScore(Long userId) {
        // Simulate a random CIBIL score between 300 and 900
        Random random = new Random();
        return 300 + random.nextInt(601); // Generates a number between 300 and 900
    }
}