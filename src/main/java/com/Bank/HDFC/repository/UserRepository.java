package com.Bank.HDFC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Bank.HDFC.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Boolean existsByEmail(String email);

    Boolean existsByAccountNumber(String accountNumber);

    User findByAccountNumber(String accountNumber);
	
	
}
