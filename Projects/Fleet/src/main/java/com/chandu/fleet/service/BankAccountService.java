package com.chandu.fleet.service;

import java.util.List;
import java.util.UUID;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.chandu.fleet.entity.BankAccount;
import com.chandu.fleet.exception.BankAccountNotFound;
import com.chandu.fleet.repository.BankAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BankAccountService {

    private static final String FIXED_IFSC_CODE = "BANK0001234";

    @Autowired
    private BankAccountRepository bankAccountRepository;

    // ✅ Create a new bank account
    public BankAccount createBankAccount(BankAccount bankAccount) {
        bankAccount.setAccountNumber(UUID.randomUUID().toString().substring(0, 10));
        bankAccount.setIfscCode(FIXED_IFSC_CODE);
        return bankAccountRepository.save(bankAccount);
    }

    // ✅ Fetch all bank accounts
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

    // ✅ Fetch a bank account by account number
    @Cacheable(value = "getAccountByNumber", key = "#accountNumber")
    public BankAccount getAccountByNumber(String accountNumber) {
        return bankAccountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new BankAccountNotFound("Bank Account not found! with account number: " + accountNumber));
    }


    @CachePut(value = "getAccountByNumber", key = "#id")
    public ResponseEntity<BankAccount> updateBankAccount(String id, BankAccount updatedBankAccount) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Account ID cannot be null or empty");
        }

        BankAccount existingAccount = bankAccountRepository.findByAccountNumber(id)
                .orElseThrow(() -> new BankAccountNotFound("Bank Account not found! with ID: " + id));

        existingAccount.setFirstName(updatedBankAccount.getFirstName());
        existingAccount.setLastName(updatedBankAccount.getLastName());
        existingAccount.setDob(updatedBankAccount.getDob());
        existingAccount.setAadhar(updatedBankAccount.getAadhar());
        existingAccount.setPan(updatedBankAccount.getPan());

        BankAccount savedAccount = bankAccountRepository.save(existingAccount);
        return ResponseEntity.ok(savedAccount);
    }

    // ✅ Delete an existing bank account (ADMIN only)
    @Transactional
    @CacheEvict(value = "getAccountByNumber", key = "#id")
    public ResponseEntity<String> deleteBankAccount(String id) {
        BankAccount existingAccount = bankAccountRepository.findByAccountNumber(id)
                .orElseThrow(() -> new BankAccountNotFound("Bank Account not found! with ID: " + id));

        bankAccountRepository.delete(existingAccount);
        return ResponseEntity.ok("Bank account deleted successfully!");
    }
}
