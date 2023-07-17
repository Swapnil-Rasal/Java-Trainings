package com.citibank.domain;

import com.citibank.main.Employee;

public class Application {
	private Employee[] employeeArray = new Employee[5];

	public Application() {
		// TODO Auto-generated constructor stub
	}
	public Application(Employee[] employeeArray) {
		this.employeeArray = employeeArray;
	}

	public void setEmployeeArray(Employee[] employeeArray) {
		this.employeeArray = employeeArray;
	}
	
	public void displayAllEmployees( ) {
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
	}
	
	
	
	
	

}
