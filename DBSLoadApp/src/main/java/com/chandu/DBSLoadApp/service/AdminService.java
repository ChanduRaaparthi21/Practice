package com.chandu.DBSLoadApp.service;


import com.chandu.DBSLoadApp.model.LoanAccount;
import com.chandu.DBSLoadApp.repository.LoanAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private LoanAccountRepository loanAccountRepository;

    /**
     * Fetch all pending loans.
     *
     * @return List of pending loans.
     */
    public List<LoanAccount> getPendingLoans() {
        return loanAccountRepository.findByStatus("PENDING");
    }

    /**
     * Approve a loan by updating its status to "APPROVED".
     *
     * @param loanAccountId The ID of the loan account to approve.
     */
    public void approveLoan(Long loanAccountId) {
        LoanAccount loanAccount = loanAccountRepository.findById(loanAccountId)
                .orElseThrow(() -> new RuntimeException("Loan account not found with ID: " + loanAccountId));
        loanAccount.setStatus("APPROVED");
        loanAccountRepository.save(loanAccount);
    }

    /**
     * Reject a loan by updating its status to "REJECTED".
     *
     * @param loanAccountId The ID of the loan account to reject.
     */
    public void rejectLoan(Long loanAccountId) {
        LoanAccount loanAccount = loanAccountRepository.findById(loanAccountId)
                .orElseThrow(() -> new RuntimeException("Loan account not found with ID: " + loanAccountId));
        loanAccount.setStatus("REJECTED");
        loanAccountRepository.save(loanAccount);
    }
}