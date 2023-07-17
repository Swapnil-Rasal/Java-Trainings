package com.citibank.main;

import com.citibank.domain.Savings;

public class AccountMainV5 {
	public static void main(String[] args) {
		Savings savings = new Savings(101, "Swapnil", 10000, false);
		Savings savings2 = new Savings(102, "Paramjeet", 10000, true);
		
		boolean result = savings.withdraw(8000);
		System.out.println("Result = " + result);
		
	}

}
