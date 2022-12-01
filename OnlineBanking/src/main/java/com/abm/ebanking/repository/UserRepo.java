package com.abm.ebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abm.ebanking.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	

}
