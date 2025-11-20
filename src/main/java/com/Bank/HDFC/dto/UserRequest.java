package com.Bank.HDFC.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

//	private long id;
	private String firstName;
	private String lastName;
	private String otherName;
	private String gender;
	private String address;
	private String stateOfOrigin;

	private String email;
	private String phoneNumber;
	private String alternativePhoneNumber;

    	private String accountNumber;
//	private BigDecimal accountBalance;

}


