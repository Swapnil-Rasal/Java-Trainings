package com.citibank.domain;

public class MyClass {
	
	private static int number1 = 10;
	private static int number2 = 10;
	public static void display() {
		
		System.out.println("Value of non-static number1 =" + number1);
		System.out.println("Value of static number2 =" + number2);
		
		number1 = number1 + 10;
		number2 = number2 + 10;
		
		System.out.println("Value of non-static number1 =" + number1);
		System.out.println("Value of static number2 =" + number2);
		
	}

}
