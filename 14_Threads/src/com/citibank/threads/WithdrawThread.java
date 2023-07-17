package com.citibank.threads;

import com.citibank.domain.Account;

public class WithdrawThread implements Runnable {
	
	Account account;
	public double balance;
	private Thread thread;
	private boolean result;


	public WithdrawThread(Account account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		result = account.withdraw(balance);
		if (result) {
			System.out.println("Withdraw Successfull..!!");
			System.out.println("Updated Balance : " + account.balance);
		}
	}
}
