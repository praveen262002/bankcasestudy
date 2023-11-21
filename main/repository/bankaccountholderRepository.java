package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.main.model.BankAccountHolder;

public interface bankaccountholderRepository extends JpaRepository<BankAccountHolder, Integer>{

}
