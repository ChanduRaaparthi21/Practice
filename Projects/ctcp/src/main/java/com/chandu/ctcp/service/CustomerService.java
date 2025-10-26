package com.chandu.ctcp.service;

import com.chandu.ctcp.model.Customer;
import com.chandu.ctcp.repository.CustomerRepo;
import com.chandu.ctcp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Customer save(Customer customer) {
        // Encrypt password before saving
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerRepo.save(customer);
    }

    public String authenticate(String corporateId, String userId, String password, JwtUtil jwtUtil) {
        Optional<Customer> customerOpt = customerRepo.findByCorporateIdAndUserId(corporateId, userId);

        if (customerOpt.isPresent()) {
            Customer customer = customerOpt.get();
            if (passwordEncoder.matches(password, customer.getPassword())) {
                return jwtUtil.generateToken(customer.getUserId(), "CUSTOMER"); // ✅ User ID should be unique
            }
        }
        return null;
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Optional<Customer> findById(Integer id) {
        return customerRepo.findById(id);
    }
}
