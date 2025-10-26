package com.chandu.fleet.service;

import com.chandu.fleet.dto.RepaymentRequest;
import com.chandu.fleet.entity.FleetLoan;
import com.chandu.fleet.entity.FleetLoanRepayment;
import com.chandu.fleet.repository.FleetLoanRepository;
import com.chandu.fleet.repository.FleetLoanRepaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FleetLoanRepaymentService {

    @Autowired
    private FleetLoanRepaymentRepository fleetLoanRepaymentRepository;

    @Autowired
    private FleetLoanRepository fleetLoanRepository;

    private static final double LATE_PAYMENT_PENALTY = 100.0; // ₹100 for late EMI

    // 📌 Make a repayment (Updated to use JSON request)
    public String makeRepayment(Long loanId, RepaymentRequest request) {
        Optional<FleetLoan> loanOptional = fleetLoanRepository.findById(loanId);
        if (loanOptional.isEmpty()) {
            return "Loan not found!";
        }

        FleetLoan loan = loanOptional.get();
        double remainingBalance = loan.getRemainingBalance();
        double amountPaid = request.getAmountPaid();
        LocalDate paymentDate = request.getPaymentDate();

        // ✅ Validate amount
        if (amountPaid > remainingBalance) {
            return "Amount exceeds remaining loan balance!";
        }

        // ✅ Check for late payment (Using provided `paymentDate`)
        boolean isLate = isLatePayment(paymentDate);
        double penaltyAmount = isLate ? LATE_PAYMENT_PENALTY : 0.0;

        // ✅ Deduct amount
        double totalDeduction = amountPaid + penaltyAmount;
        remainingBalance -= totalDeduction;

        // ✅ Create repayment entry
        FleetLoanRepayment repayment = new FleetLoanRepayment();
        repayment.setFleetLoan(loan);
        repayment.setAmountPaid(amountPaid);
        repayment.setPaymentDate(java.sql.Date.valueOf(paymentDate)); // ✅ Convert LocalDate to Date

        repayment.setLatePayment(isLate);
        repayment.setPenaltyAmount(penaltyAmount);

        // ✅ Update loan status
        loan.setRemainingBalance(remainingBalance);
        if (remainingBalance <= 0) {
            loan.setStatus(FleetLoan.LoanStatus.CLOSED);
        }

        // ✅ Save repayment & update loan balance
        fleetLoanRepaymentRepository.save(repayment);
        fleetLoanRepository.save(loan);

        return "Payment successful! Remaining balance: ₹" + remainingBalance;
    }

    // 📌 Check if today’s payment is late
    private boolean isLatePayment(LocalDate paymentDate) {
        return paymentDate.getDayOfMonth() > 5; // If paid after 5th, it’s late
    }

    // 📌 Get repayment history
    public List<FleetLoanRepayment> getRepayments(Long loanId) {
        return fleetLoanRepaymentRepository.findByFleetLoanId(loanId);
    }

	
}
