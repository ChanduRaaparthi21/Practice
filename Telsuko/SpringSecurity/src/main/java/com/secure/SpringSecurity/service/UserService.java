package com.secure.SpringSecurity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.repository.UserRepo;

@Service
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User register(User user) {
        log.info("initiate the User");
        user.setPassword(passwordEncoder.encode(user.getPassword())); // 🔐 encrypt password
        log.debug("Register User "+user.getUsername() );
        log.info("User Registered Successfully");
        return userRepo.save(user);
    }

    public User findByUsername(String username) {
        log.info("find user by username: " + username);
        return userRepo.findByUsername(username);
    }
}
