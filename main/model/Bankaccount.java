package com.springboot.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bankaccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;
	
	@Column(name="rate_of_interset")
	private double rateOfInterset;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRateOfInterset() {
		return rateOfInterset;
	}
	public void setRateOfInterset(double rateOfInterset) {
		this.rateOfInterset = rateOfInterset;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "bankaccount [id=" + id + ", type=" + type + ", rateOfInterset=" + rateOfInterset + ", balance="
				+ balance + "]";
	}
	
	

}
