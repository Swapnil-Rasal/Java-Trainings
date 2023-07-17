package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.domain.Manager;

public class EmployeeManagerMain {

	public static void main(String[] args) {
		System.out.println("Manin Start");
		
		// Create object of Manager Class
		Manager manager = new Manager();
		manager.giveTask();		
		
		// Create object of Employee Class
		Employee employee = new Employee();
		int value = employee.doTask();
		
		System.out.println("Value is :: " + value);
		
		System.out.println("Main End");

	}

}
