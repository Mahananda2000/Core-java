package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount();
		account.deposit(5000);
		account.deposit(7000);
		account.withDraw(1000);
		System.out.println("My Account balance is"+ account.getBalance());
		
        BankAccount freindsAccount=new BankAccount();
        freindsAccount.deposit(700);
        freindsAccount.deposit(4000);
        account.transfer(500.00, freindsAccount);
        System.out.println("My Account balance is"+account.getBalance());
        System.out.println("The FreindsAccount balance is" +freindsAccount.getBalance());
        
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(900);
		savingsAccount.deposit(8000);
		savingsAccount.withDraw(2000);
		//savingsAccount.periodicInterest();
		System.out.println("my account balance is"+ savingsAccount.getBalance());
		
		SavingsAccount maaSavingsAccount = new SavingsAccount();
		maaSavingsAccount.deposit(900);
		savingsAccount.transfer(8000,maaSavingsAccount);
		maaSavingsAccount.transfer(2000,savingsAccount);
		//maaSavingsAccount.periodicInterest();
		System.out.println("my savings account balance is"+ savingsAccount.getBalance());
		System.out.println("my moms savings account balance is"+ maaSavingsAccount.getBalance());

		
		CurrentAccount teaBusiness = new CurrentAccount();
		teaBusiness.deposit(900);
		teaBusiness.deposit(10000);
		savingsAccount.transfer(2000,teaBusiness);
		savingsAccount.transfer(8000,teaBusiness);
		teaBusiness.transfer(1000, savingsAccount);
		System.out.println("tea Business balance is "+ teaBusiness.getBalance());

		SavingsAccount savingsAccount2=new SavingsAccount(0.7);
		savingsAccount2.deposit(1000);
		savingsAccount2.periodicInterest();
		System.out.println(savingsAccount2.getBalance());
	    		
		}
	}
		
		
		

    	
  
	


	

	





