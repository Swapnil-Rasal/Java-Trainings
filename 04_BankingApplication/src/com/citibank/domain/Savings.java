package com.citibank.domain;

public class Savings extends Account{
	private double minimumBalance = 1500;
	private boolean isSalary;
	
	public Savings() {
		//System.out.println("Savings class default constructor called");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		//System.out.println("Savings class parameterized constructor called");
		this.minimumBalance = minimumBalance;
		this.isSalary = isSalary;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && isSalary && getBalance() >= amount) {
				setBalance(getBalance() - amount);
				return true;
		}
		if (amount > 0 && isSalary==false && getBalance() - amount >= minimumBalance) {
				setBalance(getBalance() - amount);
				return true;
		}
		return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		if(amount>0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
	
}
