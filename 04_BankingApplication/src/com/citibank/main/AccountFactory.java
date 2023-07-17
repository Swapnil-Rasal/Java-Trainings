package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;
import com.citibank.domain.Savings;

public class AccountFactory {

	public Account createAccount(int accType) {
		int AccNum;
		String AccName;
		double AccBal;
		double overBal;
		String salAcc;
		boolean isSal = false;
		Scanner scanner = new Scanner(System.in);
		
		switch (accType) {
		case 1:
			System.out.println("Do you want to open Salary Account (Y/N)-");
			salAcc = scanner.next();
			System.out.println("Enter Account Number - ");
			AccNum = scanner.nextInt();
			System.out.println("Enter Name - ");
			AccName = scanner.next();
			System.out.println("Enter Balance -");
			AccBal = scanner.nextDouble();
			
			if (salAcc.equalsIgnoreCase("y"))	
				isSal = true;
			
			return new Savings(AccNum, AccName, AccBal, isSal);
			
		case 2:  
			System.out.println("Enter Account Number - ");
			AccNum = scanner.nextInt();
			System.out.println("Enter Name - ");
			AccName = scanner.next();
			System.out.println("Enter Balance -");
			AccBal = scanner.nextDouble();
			System.out.println("Enter Overdraft Balance");
			overBal = scanner.nextDouble();
			
			return new Current(AccNum, AccName, AccBal, overBal);
			
		case 3:
			System.out.println("Thank You");
			return null;
			
		default:
			return null;
		}
	}

}
