package com.chandu.fleet.repository;

import com.chandu.fleet.entity.FleetLoanRepayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FleetLoanRepaymentRepository extends JpaRepository<FleetLoanRepayment, Long> {
    List<FleetLoanRepayment> findByFleetLoanId(Long loanId);
}
