package com.springboot.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Bankaccount;
import com.springboot.main.model.BankAccountHolder;
import com.springboot.main.service.BankaccountService;
import com.springboot.main.service.bankaccountholderService;

@RestController
@RequestMapping("/bankaccount")
public class bankaccountController {
	
	@PostMapping("/add")
    public ResponseEntity<Bankaccount> createbankAccount(@RequestBody Bankaccount bankaccount) {
    	Bankaccount bankaccount = BankaccountService.bankaccount(bankaccount);
        return ResponseEntity.ok(bankaccount);
    }
    
	
	

}
