//package com.chandu.fleet.controller;
//
//import static net.bytebuddy.matcher.ElementMatchers.is;
//import static org.hamcrest.Matchers.notNullValue;
//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.http.ResponseEntity.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.chandu.fleet.entity.BankAccount;
//import com.chandu.fleet.service.BankAccountService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@ExtendWith(MockitoExtension.class)
//class BankAccountControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private BankAccountService bankAccountService;
//
//    @InjectMocks
//    private BankAccountController bankAccountController;
//
//    private BankAccount bankAccount;
//
//    @BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(bankAccountController).build();
//
//        bankAccount = new BankAccount(1L
//                , "123456789",
//                "HDFC1234",
//                "Chandu",
//                "Raparthi",
//                "1995-06-21",
//                "123456789012",
//                "ABCDE1234F");
//
//    }
//
//    //  Test for createBankAccount()
//    @Test
//    void testCreateBankAccount() throws Exception {
//        when(bankAccountService.createBankAccount(any(BankAccount.class))).thenReturn(bankAccount);
//
//        mockMvc.perform(post("/bank/create-account")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(bankAccount)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.accountNumber").value("123456789"));
//
//        verify(bankAccountService, times(1)).createBankAccount(any(BankAccount.class));
//    }
//
//    // Test for getAllAccounts()
//    @Test
//    void testGetAllAccounts() throws Exception {
//        List<BankAccount> bankAccounts = Arrays.asList(bankAccount);
//
//        when(bankAccountService.getAllBankAccounts()).thenReturn(bankAccounts);
//
//        mockMvc.perform(get("/bank/all-accounts"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.size()").value(1));
//
//        verify(bankAccountService, times(1)).getAllBankAccounts();
//    }
//
//    // Test for getAccountByNumber()
//    @Test
//    void testGetAccountByNumber() throws Exception {
//        when(bankAccountService.getAccountByNumber("123456789")).thenReturn(ok(bankAccount));
//
//        mockMvc.perform(get("/bank/account/123456789"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", notNullValue()))
//                .andExpect(jsonPath("$.accountNumber").value("123456789"));
//
//        verify(bankAccountService, times(1)).getAccountByNumber("123456789");
//    }
//
//    //  Test for Hi() (Public endpoint)
//    @Test
//    void testHiEndpoint() throws Exception {
//        mockMvc.perform(get("/bank/hi"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hi"));
//    }
//}
