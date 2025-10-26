package com.chandu.DBSLoadApp.repository;


import com.chandu.DBSLoadApp.model.LoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanAccountRepository extends JpaRepository<LoanAccount, Long> {
    List<LoanAccount> findByStatus(String status);
}