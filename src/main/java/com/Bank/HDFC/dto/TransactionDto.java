package com.Bank.HDFC.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TransactionDto {
    private String transactionType;
    private String amount;
    private String accountNumber;
    private String status;

}
