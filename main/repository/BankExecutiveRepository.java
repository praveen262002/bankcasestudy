package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.BankExecutive;

public interface BankExecutiveRepository extends JpaRepository<BankExecutive, Integer> {

}
