package com.citibank.main;

import com.citibank.domain.Application;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		employees[0] = new Employee(101, "Emp 1", 1000);
		employees[1] = new Employee(102, "Emp 2", 2000);
		employees[2] = new Employee(103, "Emp 3", 3000);
		employees[3] = new Employee(104, "Emp 4", 4000);
		employees[4] = new Employee(105, "Emp 5", 5000);
		
		Application application = new Application(employees);
		application.displayAllEmployees();
		
		System.out.println();
		
		Application application2 = new Application();
		application2.setEmployeeArray(employees);
		application2.displayAllEmployees();
		
		}
}

