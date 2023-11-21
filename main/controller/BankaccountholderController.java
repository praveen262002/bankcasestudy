package com.springboot.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Backlog;
import com.springboot.main.model.BankAccountHolder;
import com.springboot.main.service.bankaccountholderService;

@RestController
@RequestMapping("/accountHolders")
public class BankaccountholderController {
	

	 
	    @PostMapping("/post")
		public BankAccountHolder postbankaccountholder(@RequestBody BankAccountHolder bankaccountholder) {
			return bankaccountholderService.postaccountholder(bankaccountholder);
		}
	    
	    
	

}
