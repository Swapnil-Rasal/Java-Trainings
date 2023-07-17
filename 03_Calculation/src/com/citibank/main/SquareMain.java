package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Square;

public class SquareMain {
	
	public static void main(String[] args) {
		
		System.out.println("Inside SquareManin");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		System.out.println("Number Entered : " + number);
		
		Square square = new Square();
		//int input = 10;
		int result = square.calculateSquare(number);
		
		System.out.println("Input passed is :" + number);
		System.out.println("Square of " + number + " is : " + result );				
 		
	}

}
