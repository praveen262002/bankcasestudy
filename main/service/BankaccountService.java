package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.springboot.main.model.Bankaccount;
import com.springboot.main.repository.BankaccountRepository;


public class BankaccountService {

	@Autowired
	private static BankaccountRepository bankaccountRepository;

	
	public static Bankaccount bankaccount(Bankaccount bankaccount) {
		// TODO Auto-generated method stub
		return bankaccountRepository.save(bankaccount);
	}

	

	

}
