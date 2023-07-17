package com.citibank.main;

import java.util.Arrays;
import java.util.Comparator;

import com.citibank.domain.CompareByEmployeeId;
import com.citibank.domain.Employee;

public class ComparatorComparableMain {

	public static void main(String[] args) {
		int[] numbers = {2, 5, 3, 1, 8};
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		Arrays.sort(numbers);
		System.out.println("After Sorting :");
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		Employee employee1 = new Employee(105, "A", 3000);
		Employee employee2 = new Employee(102, "C", 1000);
		Employee employee3 = new Employee(106, "B", 2000);
		
		Employee[] employees = {employee1, employee2, employee3 };
		
		for (Employee employee : employees) {
			System.out.println(employee);			
		}
		
//		Arrays.sort(employees);
		
		System.out.println("After Sorting ");

//		for (Employee employee : employees) {
//			System.out.println(employee);			
//		}
		
		System.out.println("------------------------------");
		System.out.println("Compare Employee By Employee ID");
		
		CompareByEmployeeId byEmployeeId = new CompareByEmployeeId();
		
		Arrays.sort(employees, byEmployeeId);
		
		for (Employee employee : employees) {
			System.out.println(employee);			
		}
		
		System.out.println("------------------------------");
		System.out.println("Compare Employee By Employee Name");
		
		Comparator<Employee> byEmployeName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		Arrays.sort(employees, byEmployeName);
		
		for (Employee employee : employees) {
			System.out.println(employee);			
		}
		
		System.out.println("------------------------------");
		System.out.println("Compare Employee By Employee Salary");
		
		Comparator<Employee> byEmployeeSalary = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());
		Arrays.sort(employees, byEmployeeSalary);
		
		for (Employee employee : employees) {
			System.out.println(employee);			
		}
		
		
		
	}

}
