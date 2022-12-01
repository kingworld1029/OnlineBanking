package com.abm.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abm.ebanking.entity.Beneficiary;
import com.abm.ebanking.entity.User;

public interface BeneficiaryRepo extends JpaRepository<Beneficiary, Long>{

}
