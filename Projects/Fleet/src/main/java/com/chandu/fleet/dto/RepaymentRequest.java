package com.chandu.fleet.dto;

import java.time.LocalDate;

import com.chandu.fleet.entity.FleetLoan;

public class RepaymentRequest {
    private FleetLoan fleetLoan;  // Represents the account details
    private double amountPaid;
    private LocalDate paymentDate;
    private boolean latePayment;
    private double penaltyAmount;

    // ✅ Getters and Setters
    public FleetLoan getFleetLoan() {
        return fleetLoan;
    }
    public void setFleetLoan(FleetLoan fleetLoan) {
        this.fleetLoan = fleetLoan;
    }
    
    public double getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isLatePayment() {
        return latePayment;
    }
    public void setLatePayment(boolean latePayment) {
        this.latePayment = latePayment;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }
    public void setPenaltyAmount(double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }
}
