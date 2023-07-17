package com.citibank.main;

import com.citibank.domain.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		
		int result;
		
		Calculations calculations = new Calculations();
		
//		calculations.accept();
		result = calculations.acceptAndCalculate();
		System.out.println("Result is :: " + result);
//		calculations.display();
		
	}

}
