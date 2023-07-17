package com.citibank.main;

import com.citibank.domain.Receiver;
import com.citibank.threads.Caller;

public class ThreadSynchronizationMain {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Caller vivek = new Caller(receiver, "Hi");
		Caller jimit = new Caller(receiver, "Hello");
		Caller mukul = new Caller(receiver, "How are you!");
		
//		receiver.getCall("Hi");
//		receiver.getCall("Hello");
//		receiver.getCall("How Are You?");
		

	
	}

}
