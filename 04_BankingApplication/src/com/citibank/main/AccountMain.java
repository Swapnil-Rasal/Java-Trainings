package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Swapnil Rasal");
		account.setBalance(1000);
		
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Aaditya Purohit");
		account2.setBalance(2000);
		
		System.out.println("Account Number  = " + account.getAccountNumber());
		System.out.println("Account Name    = " + account.getName());
		System.out.println("Account Balance = " + account.getBalance());
				
		System.out.println("Account Number  = " + account2.getAccountNumber());
		System.out.println("Account Name    = " + account2.getName());
		System.out.println("Account Balance = " + account2.getBalance());
		
		System.out.println("Main End");
	}

}
