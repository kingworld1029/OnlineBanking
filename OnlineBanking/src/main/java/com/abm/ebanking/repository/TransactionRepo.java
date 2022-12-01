package com.abm.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abm.ebanking.entity.Transaction;


public interface TransactionRepo extends JpaRepository<Transaction, Long>{

}
