package com.citibank.domain;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		// System.out.println("Current class default constructor called");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		// System.out.println("Savings class parameterized constructor called");
		this.overdraftBalance = overdraftBalance;
		this.initialOverdraftBalance = overdraftBalance;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (super.withdraw(amount)) {
			return true;
		}
		else if (amount > 0 && overdraftBalance > 0 && getBalance() > 0 ) {
				if (getBalance() + overdraftBalance >= amount) {
					amount = amount-getBalance();
					setBalance(0);
					overdraftBalance -= amount;
					return true;
				}
		} 
		return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		if (amount>0) {
			if (initialOverdraftBalance > overdraftBalance) {
				if (amount < (initialOverdraftBalance - overdraftBalance)) {
					overdraftBalance = overdraftBalance + amount;
					return true;
				} else {
					amount = amount - (initialOverdraftBalance - overdraftBalance);
					overdraftBalance = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				}
			}else {
				setBalance(getBalance() + amount);
				return true;
			}	
		}
		else
			return false;
	}
}
