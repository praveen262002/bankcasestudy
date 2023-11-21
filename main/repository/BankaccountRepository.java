package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Bankaccount;

public interface BankaccountRepository extends JpaRepository<Bankaccount, Integer> {

}
