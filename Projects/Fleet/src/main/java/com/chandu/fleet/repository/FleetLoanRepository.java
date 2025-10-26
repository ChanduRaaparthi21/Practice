package com.chandu.fleet.repository;

import com.chandu.fleet.entity.FleetLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FleetLoanRepository extends JpaRepository<FleetLoan, Long> {
    List<FleetLoan> findByAccountNumber(String accountNumber);
}
