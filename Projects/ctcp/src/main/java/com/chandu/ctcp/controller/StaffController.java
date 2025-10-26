package com.chandu.ctcp.controller;

import com.chandu.ctcp.model.Admin;
import com.chandu.ctcp.model.Staff;
import com.chandu.ctcp.security.JwtUtil;
import com.chandu.ctcp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    private JwtUtil jwtUtil;

//    @GetMapping
//    public List<Staff> getAllStaff() {
//        return staffService.getAllStaff();
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Staff>> getStaffById(@PathVariable int id) {
//        Optional<Staff> staff = staffService.getStaffById(id);
//        return ResponseEntity.ok(staff);
//    }

    @PostMapping("register")
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff) {
        return ResponseEntity.ok(staffService.addStaff(staff));
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable int id, @RequestBody Staff updatedStaff) {
        return staffService.updateStaff(id, updatedStaff);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Staff staff) {
        String token = staffService.authenticate(staff.getName(), staff.getPassword(), staff.getRole(), jwtUtil);

        if (token != null) {
            return ResponseEntity.ok("JWT Token: " + token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

//    @DeleteMapping("/{id}")
//    public void deleteStaff(@PathVariable int id) {
//        staffService.deleteStaff(id);
//    }
}