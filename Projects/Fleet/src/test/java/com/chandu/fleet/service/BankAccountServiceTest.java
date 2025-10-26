package com.chandu.fleet.service;

import com.chandu.fleet.entity.BankAccount;
import com.chandu.fleet.repository.BankAccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BankAccountServiceTest {

    @Mock
    BankAccountRepository bankAccountRepository;

    @InjectMocks
    BankAccountService bankAccountService;

    @Test
    void createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("1234567890");
        bankAccount.setIfscCode("ABCDE123");
        bankAccount.setFirstName("John");
        bankAccount.setLastName("Doe");
        bankAccount.setDob("1990-01-01");
        bankAccount.setAadhar("986858");
        bankAccount.setPan("AB123456");
        bankAccount.setId(1L);
        Mockito.when(bankAccountRepository.save(bankAccount)).thenReturn(bankAccount);
      BankAccount account =  bankAccountService.createBankAccount(bankAccount);
//        System.out.println("createBankAccount");
        assertEquals(bankAccount.getId(), account.getId());

    }

    @Test
    void getAllBankAccounts() {
    }

    @Test
    void getAccountByNumber() {
    }


    @Test
    void testingTest(){
        System.out.println("testing");
    }

}