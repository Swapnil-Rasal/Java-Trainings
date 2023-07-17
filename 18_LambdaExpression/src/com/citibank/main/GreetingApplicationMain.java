package com.citibank.main;

import com.citibank.domain.GoodAfternoon;
import com.citibank.domain.GoodMorning;
import com.citibank.domain.GreetingApplication;
import com.citibank.domain.Greetings;

public class GreetingApplicationMain {

	public static void main(String[] args) {
		
		GoodMorning goodMorning = new GoodMorning();
		GreetingApplication greetingApplication = new GreetingApplication(goodMorning);
		
		greetingApplication.doGreet();
		
		GoodAfternoon goodAfternoon = new GoodAfternoon();
		GreetingApplication greetingApplication2 = new GreetingApplication(goodAfternoon);
		
		greetingApplication2.doGreet();
		
		System.out.println();
		
		Greetings goodEveningGreetings = () -> System.out.println("Good Evening");
		
		GreetingApplication greetingApplication3 = new GreetingApplication(goodEveningGreetings);
		greetingApplication3.doGreet();
		
		

	}

}
