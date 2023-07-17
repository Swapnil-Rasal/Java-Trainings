package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;
import com.citibank.domain.Savings;

public class AccountMainV8 {
	public static void main(String[] args) {
		Account account = null;
		int AccNum;
		int accType = 0;
		String AccName;
		double AccBal;
		double overBal;
		String salAcc;
		boolean isSal = false;
		//Savings account;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------> Menu <-------");
		System.out.println("1. Savings Account ");
		System.out.println("2. Current Account ");
		System.out.println("3. Quit");
		System.out.println("Enter an Account Type you want to open -");
		
		accType =	scanner.nextInt();
		
		AccountFactory factory = new AccountFactory();
		account = factory.createAccount(accType);
		
		if (account != null) {
			System.out.println("Accout opened Successfully...!!!");
			System.out.println("Account Number  = " + account.getAccountNumber());
			System.out.println("Account Name    = " + account.getName());
			System.out.println("Account Balance = " + account.getBalance());
			if (account instanceof Savings)
				System.out.println("Is Salary Acc?  = " + ((Savings) account).isSalary());
			else if (account instanceof Current)
				System.out.println("Overdraft Balance = " + ((Current) account).getOverdraftBalance());
						
		} else {
			System.out.println("Invalid Choice of Account");
		}
		
		boolean quit = false;
		do {
			System.out.println("___________________");
			System.out.println("MENU :");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Display balance");
			System.out.println("4. Quit");
			System.out.println("Enter Your Choice - ");
			int txn = scanner.nextInt();

			switch (txn) {
			case 1:
				System.out.println("You have selected Withdraw");
				System.out.println("Enter Amout to Withdraw");
				int amount = scanner.nextInt();
				if(account.withdraw(amount)) {
					System.out.println("Withdrawl Successful");
					if (account instanceof Savings)
						System.out.println("Updated Balance = " + account.getBalance());
					if (account instanceof Current) {
						System.out.println("Updated Balance = " + account.getBalance());
						System.out.println("Overdraft Balance = " + ((Current) account).getOverdraftBalance());
					}
				}
				else 
					System.out.println("Withdrawl Failed");
				break;
			case 2:
				System.out.println("You have selected Deposit");
				System.out.println("Enter Amout to Deposit");
				amount = scanner.nextInt();
				if(account.deposit(amount)) {
					System.out.println("Deposit Successful");
				if (account instanceof Savings)
					System.out.println("Updated Balance = " + account.getBalance());
				if (account instanceof Current)
					System.out.println("Updated Balance = " + account.getBalance());
					System.out.println("Overdraft Balance = " + ((Current) account).getOverdraftBalance());
				}
				else 
					System.out.println("Withdrawl Failed");

				break;
			case 3:
				System.out.println("You have selected Display Balance");
				if (account instanceof Savings)
					System.out.println("Updated Balance = " + account.getBalance());
				if (account instanceof Current) {
					System.out.println("Updated Balance = " + account.getBalance());
					System.out.println("Overdraft Balance = " + ((Current) account).getOverdraftBalance());
				}
				break;
			case 4:
				System.out.println("You have selected Quit");
				System.out.println("Thank You");
				quit=true;
				break;

			default:
				System.out.println("Incorrect option selected!!!");
				System.out.println("Please select correct option");
				break;
			}
		} while (!quit);
		
		
		
	}

}
