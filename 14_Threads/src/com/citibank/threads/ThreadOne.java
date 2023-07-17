package com.citibank.threads;

public class ThreadOne extends Thread {
	
	public void run() {
		System.out.println("ThreadOne start");
		
		for (int i = 0; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadOne "+ i +"  Start");				
		}
		
		System.out.println("ThreadOne end");
	}
}
