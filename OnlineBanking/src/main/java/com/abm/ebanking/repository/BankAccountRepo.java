package com.abm.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abm.ebanking.entity.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Long> {

}
