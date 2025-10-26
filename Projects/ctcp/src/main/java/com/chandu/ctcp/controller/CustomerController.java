package com.chandu.ctcp.controller;

import com.chandu.ctcp.model.Customer;
import com.chandu.ctcp.security.JwtUtil;
import com.chandu.ctcp.service.ComplaintService;
import com.chandu.ctcp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private ComplaintService complaintService;

    @PostMapping("/register")  // ✅ Changed to @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.save(customer));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Customer customer) {
        String token = customerService.authenticate(customer.getCorporateId(), customer.getUserId(), customer.getPassword(), jwtUtil);

        if (token != null) {
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return ResponseEntity.ok(response);
        } else {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Invalid credentials");
            return ResponseEntity.status(401).body(errorResponse);
        }
    }

//    @GetMapping("/all") // ✅ Added an endpoint to expose customer list
//    public ResponseEntity<List<Customer>> findAllCustomers() {
//        return ResponseEntity.ok(customerService.findAll());
//    }
//
//    @GetMapping("get/{id}")
//    public Optional<Customer> findById(@RequestParam Integer id){
//        return  customerService.findById(id);
//
//    }
}
