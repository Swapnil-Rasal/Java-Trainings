package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
//		Account account = new Account();
		Account account1 = new Account(12345, "Swapnil Rasal", 5000);
//		Account account2 = new Account();
		
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getName());
		System.out.println(account1.getBalance());
		
//		Account account2 = new Account(6789, "Aaditya");
		
//		System.out.println(account2.getAccountNumber());
//		System.out.println(account2.getName());
		
		System.out.println("Deposit = 2000");
		boolean result = account1.deposit(2000);
		if (result) {
			System.out.println("Transaction Successful");
		}
		else {
			System.out.println("Transaction Failed");
		}
		
		System.out.println("Balance = " + account1.getBalance());
	
		System.out.println("Withdraw = 10000");
		result = account1.withdraw(10000);
		if (result) {
			System.out.println("Transaction Successful");
		}
		else {
			System.out.println("Transaction Failed");
		}
		
		System.out.println("Balance = " + account1.getBalance());
		
		System.out.println("Main End");
		 
	}

}
