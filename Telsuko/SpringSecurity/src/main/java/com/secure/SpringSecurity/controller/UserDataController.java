package com.secure.SpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import com.secure.SpringSecurity.model.UserData;
import com.secure.SpringSecurity.service.UserDataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class UserDataController {

    @Autowired
    private UserDataService service;

    // ✅ Add data (authenticated user)
    @PostMapping("/add")
    public UserData addData(@RequestBody UserData data, Authentication authentication) {
        return service.addData(authentication.getName(), data);
    }

    // ✅ Get logged-in user's data
    @GetMapping("/mydata")
    public List<UserData> getMyData(Authentication authentication) {
        return service.getMyData(authentication.getName());
    }

    // ✅ Get all data with pagination
    @GetMapping("/all")
    public Page<UserData> getAllData(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return service.getAllData(pageable);
    }
}
