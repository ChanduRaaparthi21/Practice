package com.chandu.DBSLoadApp.repository;


import com.chandu.DBSLoadApp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {}