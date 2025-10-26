package com.chandu.fleet.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fleet_loans")
public class FleetLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String accountNumber;  

    @Column(nullable = false)
    private Double loanAmount;

    @Column(nullable = false)
    private Integer loanTerm; // Months

    @Column(nullable = false)
    private Double interestRate;

    @Column(nullable = false)
    private String vehicleDetails;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LoanStatus status;

    @Column(nullable = false)
    private Double remainingBalance; // NEW: To track balance after payments

    @Column(name = "monthly_emi", nullable = false)// NEW: Pre-calculated EMI
    private Double monthlyEmi;

 

    @OneToMany(mappedBy = "fleetLoan", cascade = CascadeType.ALL)
    private List<FleetLoanRepayment> repayments; // NEW: Track repayments

    public enum LoanStatus {
        PENDING, APPROVED, REJECTED, CLOSED
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(Integer loanTerm) {
		this.loanTerm = loanTerm;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public String getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public LoanStatus getStatus() {
		return status;
	}

	public void setStatus(LoanStatus status) {
		this.status = status;
	}

	public Double getRemainingBalance() {
		return remainingBalance;
	}

	public void setRemainingBalance(Double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}

	public Double getMonthlyEMI() {
		return monthlyEmi;
	}

	public void setMonthlyEMI(Double monthlyEMI) {
		this.monthlyEmi = monthlyEMI;
	}

	public List<FleetLoanRepayment> getRepayments() {
		return repayments;
	}

	public void setRepayments(List<FleetLoanRepayment> repayments) {
		this.repayments = repayments;
	}

	public FleetLoan(Long id, String accountNumber, Double loanAmount, Integer loanTerm, Double interestRate,
			String vehicleDetails, LoanStatus status, Double remainingBalance, Double monthlyEMI,
			List<FleetLoanRepayment> repayments) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.loanAmount = loanAmount;
		this.loanTerm = loanTerm;
		this.interestRate = interestRate;
		this.vehicleDetails = vehicleDetails;
		this.status = status;
		this.remainingBalance = remainingBalance;
		this.monthlyEmi = monthlyEMI;
		this.repayments = repayments;
	}

	public FleetLoan() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
