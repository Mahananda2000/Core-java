package com.xworkz.bankapp.bank;

public class BankAccount {
// class is not able to make class as private	
	//name,ifscCode,branchName,accountNo
	public String name;
	String ifscCode;
	String branchName;
	
	//let see
	String accountNo;
	//this keyword achieve encapsulation 
	private double  balance;
	
	public double withDraw(double balance) {
		System.out.println("The amount to be withdrawn"+ balance);
		this.balance=this.balance-balance;
		return this.balance;
		
	}
	//balance=5000
	public double deposit(double balance) {
		//0.0+5000;
		System.out.println("amount to be deposited"+ balance);
		this.balance=this.balance+balance;
		return this.balance;		
	}
	
	public void transfer(double amount,BankAccount FreindsAccount) {
		System.out.println("transfering to another");
		withDraw(amount);
		FreindsAccount.deposit(amount);
		System.out.println("transfering done...Transaction Successfully");
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

}
