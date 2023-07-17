package com.citibank.main;

import com.citibank.domain.Calculation;

public class CalculationMain {

	public static void main(String[] args) {
		Calculation divideCal = (double n1 , double n2) -> {
			return n1/n2;
		};
		
		double result = divideCal.doCalculation(10, 2);
		System.out.println("Division Result is " + result);
		
		Calculation addCal = (x, y) ->  x + y;
		result = addCal.doCalculation(20, 40);
		System.out.println("Addition Result is " + result);
		
//		Calculation multiCal = new Calculation() {
//			
//			@Override
//			public double doCalculation(double n1, double n2) {
//				// TODO Auto-generated method stub
//				return n1 * n2;
//			}
//		};
		
		Calculation multiCal = (n1 , n2) -> n1 * n2;
		result = multiCal.doCalculation(10, 20);
		System.out.println("Multiplication Result is " + result);
		
	}

}
