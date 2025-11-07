package com.secure.SpringSecurity.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.model.UserData;
import com.secure.SpringSecurity.repository.UserDataRepo;
import com.secure.SpringSecurity.repository.UserRepo;

import java.util.List;

@Service
public class UserDataService {

    private static final Logger logger = LoggerFactory.getLogger(UserDataService.class);

    @Autowired
    private UserDataRepo dataRepo;

    @Autowired
    private UserRepo userRepo;

    public UserData addData(String username, UserData data) {
        logger.info("addData called for username={}", username);
        if (data == null) {
            logger.error("addData received null data for username={}", username);
            throw new NullPointerException("Data must not be null");
        }

        User user = userRepo.findByUsername(username);
        if (user == null) {
            logger.error("User not found when adding data: {}", username);
            throw new IllegalArgumentException("User not found: " + username);
        }

        data.setUser(user);
        UserData saved = dataRepo.save(data);
        logger.debug("Data saved (id={} ) for username={}", saved != null ? saved.getId() : null, username);
        return saved;
    }


    public List<UserData> getMyData(String username) {
        logger.info("getMyData called for username={}", username);
        User user = userRepo.findByUsername(username);
        if (user == null) {
            logger.warn("No user found for username={}; delegating to dataRepo.findByUser(null)", username);
        } else {
            logger.debug("Found user id={} for username={}", user.getId(), username);
        }
        List<UserData> result = dataRepo.findByUser(user);
        logger.debug("getMyData returning {} records for username={}", result != null ? result.size() : 0, username);
        return result;
    }

    public Page<UserData> getAllData(Pageable pageable) {
        logger.info("getAllData called with pageable={}", pageable);
        if (pageable == null) {
            logger.error("getAllData received null pageable");
            throw new IllegalArgumentException("Pageable must not be null");
        }
        Page<UserData> page = dataRepo.findAll(pageable);
        logger.debug("getAllData returning page with totalElements={}", page != null ? page.getTotalElements() : 0);
        return page;
    }

}
