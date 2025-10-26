package com.chandu.DBSLoadApp.controller;


import com.chandu.DBSLoadApp.model.User;
import com.chandu.DBSLoadApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully";
    }


    @GetMapping("/{accountNumber}")
    public User getUserByAccountNumber(@PathVariable String accountNumber) {
        return userService.getUserByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}