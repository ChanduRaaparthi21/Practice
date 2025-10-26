package com.chandu.fleet.controller;

import java.util.List;

import com.chandu.fleet.service.CacheInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.chandu.fleet.entity.BankAccount;
import com.chandu.fleet.service.BankAccountService;

@RestController
@RequestMapping("/bank")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @Autowired
    private CacheInspectionService cacheInspectionService;

    // ✅ Create a new bank account (ADMIN only)
    @PostMapping("/create-account")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public BankAccount createBankAccount(@RequestBody BankAccount bankAccount) {
        return bankAccountService.createBankAccount(bankAccount);
    }

    // ✅ Fetch all bank accounts (ADMIN only)
    @GetMapping("/all-accounts")
    @PreAuthorize("hasRole('ADMIN')")
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    // ✅ Fetch a specific account by account number (USER & ADMIN)
    @GetMapping("/account/{accountNumber}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<BankAccount> getAccountByNumber(@PathVariable String accountNumber) {
        BankAccount account = bankAccountService.getAccountByNumber(accountNumber);
        return ResponseEntity.ok(account);
    }
    // ✅ Update a bank account (ADMIN only)
    @PutMapping("/account/update-account/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<BankAccount> updateBankAccount(@PathVariable String id, @RequestBody BankAccount updatedBankAccount) {
        return bankAccountService.updateBankAccount(id, updatedBankAccount);
    }

    // ✅ Delete a bank account (ADMIN only)
    @DeleteMapping("/account/delete-account/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> deleteBankAccount(@PathVariable String id) {
        return bankAccountService.deleteBankAccount(id);
    }

    // ✅ Public access
    @GetMapping("/hi")
    public String Hi() {
        return "Hi";
    }

    @GetMapping("/cacheData")
    public void getCacheData() {
        cacheInspectionService.printCacheContents("getAccountByNumber");
    }
}
