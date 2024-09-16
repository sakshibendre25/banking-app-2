package com.sakshi.banking.app._2.repository;

import com.sakshi.banking.app._2.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    List<Transaction> findByAccountId(Long accountId);
}
