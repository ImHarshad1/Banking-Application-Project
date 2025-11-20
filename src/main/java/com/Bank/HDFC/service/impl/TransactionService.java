package com.Bank.HDFC.service.impl;

import com.Bank.HDFC.dto.TransactionDto;
import com.Bank.HDFC.entity.Transaction;


public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);

}
