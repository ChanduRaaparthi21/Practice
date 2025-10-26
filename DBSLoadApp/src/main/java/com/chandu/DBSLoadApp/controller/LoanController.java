package com.chandu.DBSLoadApp.controller;


import com.chandu.DBSLoadApp.model.LoanAccount;
import com.chandu.DBSLoadApp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    // Create a loan account
    @PostMapping("/create")
    public ResponseEntity<String> createLoanAccount(@RequestBody LoanAccount loanAccount) {
        loanService.createLoanAccount(loanAccount);
        return ResponseEntity.ok("Loan account created successfully");
    }

    // Apply for a loan
    @PostMapping("/apply/{loanAccountId}")
    public ResponseEntity<String> applyForLoan(@PathVariable Long loanAccountId) {
        loanService.applyForLoan(loanAccountId); // Assuming you have this method in LoanService
        return ResponseEntity.ok("Loan application submitted successfully");
    }

    // Repay loan
    @PostMapping("/repay/{loanAccountId}")
    public ResponseEntity<String> repayLoan(@PathVariable Long loanAccountId, @RequestParam Double amount) {
        loanService.repayLoan(loanAccountId, amount);
        return ResponseEntity.ok("Loan repayment successful");
    }
}