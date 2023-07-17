package com.citibank.threads;

import com.citibank.domain.Account;

public class DepositThread implements Runnable {
	private Account account;
	private double balance;
	private Thread thread;
	private boolean result;

	public DepositThread(Account account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		result = account.deposit(balance);
		if (result) {
			System.out.println("Deposit Successfull..!!");
			System.out.println("Updated Balance : " + account.balance);
		}
	}

}
