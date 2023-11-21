package com.springboot.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Backlog;
import com.springboot.main.model.BankAccountHolder;
import com.springboot.main.repository.BacklogRepository;
import com.springboot.main.repository.bankaccountholderRepository;

@Service
public class bankaccountholderService {

	@Autowired
	private bankaccountholderRepository  bankaccountholderRepository;
	public BankAccountHolder insert(BankAccountHolder bankaccountholder) {
		
		return bankaccountholderRepository.save(bankaccountholder);
	}


}
