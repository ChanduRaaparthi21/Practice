package com.chandu.fleet.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "fleet_loan_repayments")
public class FleetLoanRepayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "loan_id", nullable = false)
    private FleetLoan fleetLoan;

    @Column(nullable = false)
    private Double amountPaid;

    @Column(nullable = false)
    private Date paymentDate;

    @Column(nullable = false)
    private Boolean latePayment;

    @Column(nullable = false)
    private Double penaltyAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FleetLoan getFleetLoan() {
		return fleetLoan;
	}

	public void setFleetLoan(FleetLoan fleetLoan) {
		this.fleetLoan = fleetLoan;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Boolean getLatePayment() {
		return latePayment;
	}

	public void setLatePayment(Boolean latePayment) {
		this.latePayment = latePayment;
	}

	public Double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(Double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	public FleetLoanRepayment(Long id, FleetLoan fleetLoan, Double amountPaid, Date paymentDate, Boolean latePayment,
			Double penaltyAmount) {
		super();
		this.id = id;
		this.fleetLoan = fleetLoan;
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
		this.latePayment = latePayment;
		this.penaltyAmount = penaltyAmount;
	}

	public FleetLoanRepayment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
