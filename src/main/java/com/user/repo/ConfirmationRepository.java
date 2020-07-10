package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.ConfirmationToken;

@Repository
public interface ConfirmationRepository extends JpaRepository<ConfirmationToken, String>{
	ConfirmationToken findByConfirmationToken(String confrimationToken);
}	
