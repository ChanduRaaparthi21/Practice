package com.chandu.fleet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.fleet.entity.BankAccount;
import com.chandu.fleet.entity.FleetLoan;
import com.chandu.fleet.repository.BankAccountRepository;
import com.chandu.fleet.repository.FleetLoanRepository;

@Service
public class FleetLoanService {

    @Autowired
    private FleetLoanRepository fleetLoanRepository;

    @Autowired
    private BankAccountRepository bankAccountRepository;

    /**
     * Apply for a new fleet loan.
     * Ensures the user has a valid bank account and calculates the EMI before saving.
     */
    public FleetLoan applyLoan(FleetLoan loan) {
        Optional<BankAccount> bankAccount = bankAccountRepository.findByAccountNumber(loan.getAccountNumber());

        if (bankAccount.isPresent()) {
            loan.setStatus(FleetLoan.LoanStatus.PENDING);

            // Ensure monthly EMI is calculated before saving
            double emi = calculateEMI(loan.getLoanAmount(), loan.getInterestRate(), loan.getLoanTerm());
            loan.setMonthlyEMI(emi);

            // Initially, remaining balance is the total loan amount
            loan.setRemainingBalance(loan.getLoanAmount());

            return fleetLoanRepository.save(loan);
        } else {
            throw new RuntimeException("You don't have a bank account with this bank.");
        }
    }

    /**
     * Get all loans associated with a specific account number.
     */
    public List<FleetLoan> getLoansByAccount(String accountNumber) {
        return fleetLoanRepository.findByAccountNumber(accountNumber);
    }

    /**
     * Get a loan by its ID.
     */
    public Optional<FleetLoan> getLoanById(Long loanId) {
        return fleetLoanRepository.findById(loanId);
    }

    /**
     * Approve a loan by changing its status.
     */
    public FleetLoan approveLoan(Long loanId) {
        FleetLoan loan = fleetLoanRepository.findById(loanId)
                .orElseThrow(() -> new RuntimeException("Loan not found"));
        loan.setStatus(FleetLoan.LoanStatus.APPROVED);
        return fleetLoanRepository.save(loan);
    }

    /**
     * Reject a loan by changing its status.
     */
    public FleetLoan rejectLoan(Long loanId) {
        FleetLoan loan = fleetLoanRepository.findById(loanId)
                .orElseThrow(() -> new RuntimeException("Loan not found"));
        loan.setStatus(FleetLoan.LoanStatus.REJECTED);
        return fleetLoanRepository.save(loan);
    }

    /**
     * EMI Calculation Formula: 
     * EMI = [P * R * (1+R)^N] / [(1+R)^N - 1]
     * Where:
     * P = Loan Amount
     * R = Monthly Interest Rate (Annual Interest Rate / 12 / 100)
     * N = Loan Term in Months
     */
    private double calculateEMI(double loanAmount, double interestRate, int loanTerm) {
        double monthlyRate = (interestRate / 100) / 12;
        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, loanTerm)) / 
               (Math.pow(1 + monthlyRate, loanTerm) - 1);
    }
}
