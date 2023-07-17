package com.citibank.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee;
		
		int employeeId;
		String firstName;
		String lastName;
		String email;
		double salary;
		int choice;
		String continueChoice;
		boolean result;
		
	do {
		System.out.println("Menu ");
		System.out.println("1. Add New Employee");
		System.out.println("2. Update Salary of Existing Employee");
		System.out.println("3. Display Single Employee Details");
		System.out.println("4. Display All Employees");
		System.out.println("5. Delete Single Employee");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("You have selected to Add New Employee");
			System.out.println("Enter Employee Details");
			System.out.println("Employee ID : ");
			employeeId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Employee First Name :");
			firstName = scanner.next();
			System.out.println("Employee Last Name :");
			lastName = scanner.next();
			System.out.println("Employee email :");
			email = scanner.next();
			System.out.println("Employee Salary :");
			salary = scanner.nextDouble();
			
			employee = new Employee(employeeId, firstName, lastName, email, salary);			
			result = employeeRepository.addNewEmployee(employee);
			
			if (result) {
				System.out.println("Employee Added Successfully");				
			} else {
				System.out.println("Adding Employee Failed");
			}
			
			break;
			
		case 2:
			System.out.println("You have selected to Update Salary of Existing Employee");
			System.out.println("Please enter Employee ID : ");
			employeeId = scanner.nextInt();
			System.out.println("Please enter new Salary : ");
			salary = scanner.nextInt();
			
			result = employeeRepository.updateEmployeeSalary(employeeId, salary);
			if (result) {
				System.out.println("Employee Salary updated Successfully");				
			} else {
				System.out.println("Updating Employee Salary Failed");
			}
			break;
			
		case 3:
			System.out.println("You have selected to Display Single Employee Details");
			System.out.println("Please enter Employee ID : ");
			employeeId = scanner.nextInt();
			
			employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
			if (employee != null) {
				System.out.println("Employee Details found..!!");
				System.out.println(employee);
			}else {
				System.out.println("Sorry Employee Details NOT found!!");
			}
			break;
			
		case 4:
			System.out.println("You have selected to Display All Employees");
			List<Employee> employeeList = employeeRepository.getAllEmployees();
			for (Employee e : employeeList) {
				System.out.println(e);
			}
			break;
			
		case 5:
			System.out.println("You have selected to Delete Single Employee Details");
			System.out.println("Please enter Employee ID : ");
			employeeId = scanner.nextInt();
			
			result = employeeRepository.deleteEmployeeByEmployeeId(employeeId);
			if (result) {
				System.out.println("Employee Details Deleted Successfully");				
			} else {
				System.out.println("Deleting Employee Details Failed");
			}
			break;

		default:
			System.out.println("Please Enter Correct Choice");			
			break;
		}
		
		System.out.println("Do you want to continue? (yes/no)");
		continueChoice = scanner.next();
	}while (continueChoice.equalsIgnoreCase("yes"));
	System.out.println("Thank You");
	}

}
