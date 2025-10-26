package com.chandu.DBSLoadApp.service;


import com.chandu.DBSLoadApp.model.LoanAccount;
import com.chandu.DBSLoadApp.model.Transaction;
import com.chandu.DBSLoadApp.repository.LoanAccountRepository;
import com.chandu.DBSLoadApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanAccountRepository loanAccountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public LoanAccount createLoanAccount(LoanAccount loanAccount) {
        return loanAccountRepository.save(loanAccount);
    }

    public List<LoanAccount> getPendingLoans() {
        return loanAccountRepository.findByStatus("PENDING");
    }

    public void approveLoan(Long loanAccountId) {
        LoanAccount loanAccount = loanAccountRepository.findById(loanAccountId).orElseThrow();
        loanAccount.setStatus("APPROVED");
        loanAccountRepository.save(loanAccount);
    }

    public void rejectLoan(Long loanAccountId) {
        LoanAccount loanAccount = loanAccountRepository.findById(loanAccountId).orElseThrow();
        loanAccount.setStatus("REJECTED");
        loanAccountRepository.save(loanAccount);
    }

    public void repayLoan(Long loanAccountId, Double amount) {
        LoanAccount loanAccount = loanAccountRepository.findById(loanAccountId).orElseThrow();
        Transaction transaction = new Transaction();
        transaction.setLoanAccount(loanAccount);
        transaction.setAmountPaid(amount);
        transactionRepository.save(transaction);
    }

    public void applyForLoan(Long loanAccountId) {

    }
}