package com.citibank.domain;

public class Account {
	public double balance = 10000;
	
	public synchronized boolean withdraw(double amount) {
		if (amount > balance) {
			try {
				System.out.println("Less Balance, waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Balance Before Withdraw : " + balance);
			balance = balance - amount;
//			System.out.println("Balance After Withdraw : " + balance);
			return true;
		}
		return false;	
	}
	
	public synchronized boolean deposit(double amount) {
		if (amount >0) {
			System.out.println("Balance Before Deposit : " + balance);
			balance += amount;
//			System.out.println("Balance After Deposit : " + balance);
			notify();
			return true;
		}
		return false;	
	}

}
