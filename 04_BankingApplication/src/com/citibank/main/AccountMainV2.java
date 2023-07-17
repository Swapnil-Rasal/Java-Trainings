package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV2 {
	
	public static void main(String[] args) {
		//Read Account Details from User
		
		System.out.println("Main Start");
		System.out.println("Enter Account Details :");
		System.out.println("_______________________");
		
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		
		System.out.println("Enter Account Number - ");
		int AccNum = scanner.nextInt();
		
		System.out.println("Enter Name - ");
		String AccName = scanner.next();
		
		System.out.println("Enter Balance -");
		double AccBal = scanner.nextDouble();
		
			
		account.setAccountNumber(AccNum);
		account.setName(AccName);
		account.setBalance(AccBal);
		
		System.out.println("Account Number  = " + account.getAccountNumber());
		System.out.println("Account Name    = " + account.getName());
		System.out.println("Account Balance = " + account.getBalance());
	}

}
