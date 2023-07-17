package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV4 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("Enter Account Details :");
		System.out.println("_______________________");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number - ");
		int AccNum = scanner.nextInt();
		System.out.println("Enter Name - ");
		String AccName = scanner.next();

//		System.out.println("Enter Balance -");
//		double AccBal = scanner.nextDouble();

		Account account = new Account(AccNum, AccName);

		System.out.println("Account Number  = " + account.getAccountNumber());
		System.out.println("Account Name    = " + account.getName());
		System.out.println("Account Balance = " + account.getBalance());

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
					System.out.println("Updated Balance = " + account.getBalance());
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
					System.out.println("Updated Balance = " + account.getBalance());
				}
				else 
					System.out.println("Withdrawl Failed");

				break;
			case 3:
				System.out.println("You have selected Display Balance");
				System.out.println("Account Balance = " + account.getBalance());
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
