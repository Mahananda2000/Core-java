package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount{
	public double interestRate;
	public SavingsAccount() {
		System.out.println("saving account object is created");
	}
	
	
	public SavingsAccount(double interestRate) {
		System.out.println("saving account object is created");
	}
	
	
	public void periodicInterest() {
		double newBalance=getBalance()*interestRate/100;
		deposit(newBalance);
	 }
	}



