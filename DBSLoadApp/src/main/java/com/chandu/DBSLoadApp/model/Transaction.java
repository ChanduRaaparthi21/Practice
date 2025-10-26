package com.chandu.DBSLoadApp.model;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "loan_account_id", nullable = false)
    private LoanAccount loanAccount;

    private Double amountPaid;

    @Column(updatable = false)
    private LocalDateTime paymentDate = LocalDateTime.now();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanAccount getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(LoanAccount loanAccount) {
        this.loanAccount = loanAccount;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Transaction(Long id, LoanAccount loanAccount, Double amountPaid, LocalDateTime paymentDate) {
        this.id = id;
        this.loanAccount = loanAccount;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    public Transaction() {
    }
}