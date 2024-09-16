package com.sakshi.banking.app._2.repository;

import com.sakshi.banking.app._2.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Optional<Account> findByUsername(String username);
}
