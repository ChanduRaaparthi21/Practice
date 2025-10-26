

package com.chandu.ctcp.controller;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Customer;
import com.chandu.ctcp.security.JwtUtil;
import com.chandu.ctcp.service.AdminService;
import com.chandu.ctcp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class UserManagementController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        return ResponseEntity.ok(adminService.addAdmin(admin));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Admin admin) {
        String token = adminService.authenticate(admin.getName(), admin.getPassword(), jwtUtil);
        if (token != null) {
            return ResponseEntity.ok("JWT Token: " + token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PutMapping("/update/{adminId}")
    public ResponseEntity<String> updateAdmin(@PathVariable Integer adminId, @RequestBody Admin updatedAdmin) {
        String result = adminService.updateAdmin(Math.toIntExact(Long.valueOf(adminId)), updatedAdmin);
        return result.equals("Update Successful!") ? ResponseEntity.ok(result) : ResponseEntity.status(404).body(result);
    }

    @GetMapping("/all")
    public List<Admin> getAllAdmins(Admin admin){
        return adminService.findAllAdmins(admin);
    }


    @GetMapping("allCustomers")
    public List<Customer> findAllCustomers(){
        return  customerService.findAll();

    }

    @GetMapping("/getCustomer/{id}")
    public Optional<Customer> findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

}
