package com.springboot.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.BankExecutive;
import com.springboot.main.model.User;
import com.springboot.main.service.UserService;

@RestController

public class BankExecutiveController {
	
	@PostMapping("/postexecutive")
	public BankExecutive postexecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user=bankExecutive.getUser();
		String password=user.getPassword();
		
		user.setRole(Role.BANK_EXECUTIVE);
		UserService.save(user);
		
		bankExecutive.setUser(user);
		return bankExecutiveService.postexecutive(bankExecutive);
	}

}
