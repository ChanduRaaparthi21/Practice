package com.secure.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.secure.SpringSecurity.model.User;
import com.secure.SpringSecurity.model.UserData;
import java.util.List;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Integer> {
    List<UserData> findByUser(User user);}
