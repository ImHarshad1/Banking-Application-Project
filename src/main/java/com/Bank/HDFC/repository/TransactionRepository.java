package com.Bank.HDFC.repository;

import com.Bank.HDFC.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String > {


}
