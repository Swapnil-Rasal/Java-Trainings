package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int num1;
	private int num2;
	private int result=0;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("accept() start");
		
		System.out.println("Enter Num1 : ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 : ");
		num2=scanner.nextInt();
		System.out.println("accept() end");
		}
		catch (InputMismatchException | ArrayIndexOutOfBoundsException e)  {
			System.out.println("invalid input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Something is wrong!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("accept() end");
			scanner.close();
		}
	}
	public int acceptAndCalculate() {
		Scanner scanner = new Scanner(System.in);
		int result=0;
		try {
		System.out.println("accept() start");
		
		System.out.println("Enter Num1 : ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 : ");
		num2=scanner.nextInt();
		System.out.println("accept() end");
		
		System.out.println("calculate() start");
		result = num1 + num2;
		System.out.println("calculate() end");	
		return result;
		
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid user input");
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("acceptAndCalculate() end");
//			return 0;
		}
		return 0;
		
	}
	
	public void display() {
		System.out.println("display() start");
		System.out.println("Result is : " + result);
		System.out.println("display() end");
	}
	
}
