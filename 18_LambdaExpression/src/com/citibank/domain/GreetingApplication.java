package com.citibank.domain;

public class GreetingApplication {
	private Greetings greetings = null;

	public GreetingApplication(Greetings greetings) {
		super();
		this.greetings = greetings;
	}
	
	public void doGreet() {
		greetings.greet();
	}
}
