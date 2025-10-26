//package com.chandu.ctcp.controller;
//
//
//
//import com.chandu.ctcp.security.AuthService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//    private final AuthService authService;
//
//    public AuthController(AuthService authService) {
//        this.authService = authService;
//    }
//
//    @PostMapping("/admin/login")
//    public ResponseEntity<String> adminLogin(@RequestParam String name, @RequestParam String password) {
//        if (authService.authenticateAdmin(name, password)) {
//            return ResponseEntity.ok("Admin login successful");
//        }
//        return ResponseEntity.status(401).body("Invalid Admin credentials");
//    }
//
//    @PostMapping("/customer/login")
//    public ResponseEntity<String> customerLogin(@RequestParam String corporateId,
//                                                @RequestParam String userId,
//                                                @RequestParam String password) {
//        if (authService.authenticateCustomer(corporateId, userId, password)) {
//            return ResponseEntity.ok("Customer login successful");
//        }
//        return ResponseEntity.status(401).body("Invalid Customer credentials");
//    }
//
//    @PostMapping("/staff/login")
//    public ResponseEntity<String> staffLogin(@RequestParam String name, @RequestParam String password) {
//        if (authService.authenticateStaff(name, password)) {
//            return ResponseEntity.ok("Staff login successful");
//        }
//        return ResponseEntity.status(401).body("Invalid Staff credentials");
//    }
//}
