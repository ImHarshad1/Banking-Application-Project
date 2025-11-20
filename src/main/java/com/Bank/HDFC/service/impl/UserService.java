package com.Bank.HDFC.service.impl;

import com.Bank.HDFC.dto.*;
import jakarta.transaction.Transaction;

public interface UserService {

	BankResponse createAccount(UserRequest userRequest);
	BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);

}
