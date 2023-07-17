package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {
	public static void main(String[] args) {
		//create a object of Employee class - call parameterized constructor
		
		try {
			Employee employee = new Employee(10101, "Swapnil Rasal", -10000);
			System.out.println(employee);
		} catch (InvalidEmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		Employee employee2 = new Employee();
		
		try {
			employee2.setSalary(1000);
			System.out.println(employee2);
		} catch (InvalidEmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
		
		
				
	}

}
