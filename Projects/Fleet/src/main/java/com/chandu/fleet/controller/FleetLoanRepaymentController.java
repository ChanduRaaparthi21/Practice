package com.chandu.fleet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.fleet.dto.RepaymentRequest;
import com.chandu.fleet.entity.FleetLoanRepayment;
import com.chandu.fleet.service.FleetLoanRepaymentService;

@RestController
@RequestMapping("/fleet/repayments")
public class FleetLoanRepaymentController {

    @Autowired
    private FleetLoanRepaymentService fleetLoanRepaymentService;

    // 📌 Users can make loan repayments
    @PostMapping("/pay/{loanId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String makeRepayment(@PathVariable Long loanId, @RequestBody RepaymentRequest request) {
        return fleetLoanRepaymentService.makeRepayment(loanId, request);
    }


    // 📌 Users & Admins can view repayment history
    @GetMapping("/history/{loanId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')") // ✅ Both can check repayment history
    public List<FleetLoanRepayment> getRepaymentHistory(@PathVariable Long loanId) {
        return fleetLoanRepaymentService.getRepayments(loanId);
    }
    
    @GetMapping("repayment")
    public String homePage() {
    	return "Welcome to Loan Repayment Page";
    }
}
