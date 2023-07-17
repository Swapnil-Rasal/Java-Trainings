package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Current;

public class AccountMainV7 {
	public static void main(String[] args) {
		int AccNum;
		String AccName;
		double AccBal;
		double overBal;
		String salAcc;
		boolean isSal = false;
		
		System.out.println("Main Start");
		System.out.println("Enter Account Details :");
		System.out.println("_______________________");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number - ");
		AccNum = scanner.nextInt();
		System.out.println("Enter Name - ");
		AccName = scanner.next();
		System.out.println("Enter Balance -");
		AccBal = scanner.nextDouble();
		System.out.println("Enter Overdraft Balance");
		overBal = scanner.nextDouble();
		
		
		Current current = new Current(AccNum, AccName, AccBal, overBal);
		
		System.out.println("Account Number    = " + current.getAccountNumber());
		System.out.println("Account Name      = " + current.getName());
		System.out.println("Account Balance   = " + current.getBalance());
		System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
		
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
				double amount = scanner.nextInt();
				if(current.withdraw(amount)) {
					System.out.println("Withdrawl Successful");
					System.out.println("Updated Balance = " + current.getBalance());
					System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
				}
				else 
					System.out.println("Withdrawl Failed");
				break;
			case 2:
				System.out.println("You have selected Deposit");
				System.out.println("Enter Amout to Deposit");
				amount = scanner.nextInt();
				if(current.deposit(amount)) {
					System.out.println("Deposit Successful");
					System.out.println("Updated Balance = " + current.getBalance());
					System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
				}
				else 
					System.out.println("Withdrawl Failed");

				break;
			case 3:
				System.out.println("You have selected Display Balance");
				System.out.println("Account Balance = " + current.getBalance());
				System.out.println("Overdraft Balance = " + current.getOverdraftBalance());
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
