package com.chandu.DBSLoadApp.controller;


import com.chandu.DBSLoadApp.service.CibilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cibil")
public class CibilController {

    @Autowired
    private CibilService cibilService;

    // Check CIBIL score for a user
    @GetMapping("/{userId}")
    public ResponseEntity<Integer> getCibilScore(@PathVariable Long userId) {
        int score = cibilService.getCibilScore(userId);
        return ResponseEntity.ok(score);
    }
}