package com.chandu.DBSLoadApp.controller;


import com.chandu.DBSLoadApp.model.LoanAccount;
import com.chandu.DBSLoadApp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Get all pending loans
    @GetMapping("/loans/pending")
    public ResponseEntity<List<LoanAccount>> getPendingLoans() {
        return ResponseEntity.ok(adminService.getPendingLoans());
    }

    // Approve a loan
    @PutMapping("/loans/approve/{loanAccountId}")
    public ResponseEntity<String> approveLoan(@PathVariable Long loanAccountId) {
        adminService.approveLoan(loanAccountId);
        return ResponseEntity.ok("Loan approved successfully");
    }

    // Reject a loan
    @PutMapping("/loans/reject/{loanAccountId}")
    public ResponseEntity<String> rejectLoan(@PathVariable Long loanAccountId) {
        adminService.rejectLoan(loanAccountId);
        return ResponseEntity.ok("Loan rejected successfully");
    }
}