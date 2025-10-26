package com.chandu.fleet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.fleet.entity.FleetLoan;
import com.chandu.fleet.pojo.AuthRequest;
import com.chandu.fleet.service.FleetLoanService;
import com.chandu.fleet.service.JwtService;

@RestController
@RequestMapping("/api/fleet-loan")
public class FleetLoanController {

    @Autowired
    private FleetLoanService fleetLoanService;

    @Autowired
    private JwtService jwtService;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @PostMapping("/apply")
    @PreAuthorize("hasRole('USER')")
    public FleetLoan applyLoan(@RequestBody FleetLoan loan) {
        return fleetLoanService.applyLoan(loan);
    }

    @GetMapping("/{loanId}")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public Optional<FleetLoan> getLoanById(@PathVariable Long loanId) {
        return fleetLoanService.getLoanById(loanId);
    }

    @GetMapping("/user/{accountNumber}")
    @PreAuthorize("hasRole('USER')")
    public List<FleetLoan> getLoansByAccount(@PathVariable String accountNumber) {
        return fleetLoanService.getLoansByAccount(accountNumber);
    }

    @PutMapping("/approve/{loanId}")
    @PreAuthorize("hasRole('ADMIN')")
    public FleetLoan approveLoan(@PathVariable Long loanId) {
        return fleetLoanService.approveLoan(loanId);
    }

    @PutMapping("/reject/{loanId}")
    @PreAuthorize("hasRole('ADMIN')")
    public FleetLoan rejectLoan(@PathVariable Long loanId) {
        return fleetLoanService.rejectLoan(loanId);
    }
    
    
    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) {
    	
    	Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
    	
    	if(authentication.isAuthenticated()) {
        	return jwtService.generateToken(authRequest.getUsername());

    	}else {
    		throw new UsernameNotFoundException("Invalid user");
    	}
    	
    	
    }
    
}
