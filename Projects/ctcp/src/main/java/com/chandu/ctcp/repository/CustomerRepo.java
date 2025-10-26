package com.chandu.ctcp.repository;

import com.chandu.ctcp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
//    Optional<Customer> findByCorporateIdAndUserIdAndPassword(String corporateId, String userId, String password);

//    Optional<Customer> findByUserId(String userId);

    Optional<Customer> findByCorporateIdAndUserId(String corporateId, String userId);
}
