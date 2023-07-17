package com.citibank.factory;

import com.citibank.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101, "Swapnil", 50000);
		Employee employee2 = new Employee(102, "Param", 60000);
				
		System.out.println(employee);
		System.out.println("hashcode of Employee = " + employee.hashCode());
		System.out.println(employee2);
		System.out.println("hashcode of Employee2 = " + employee2.hashCode());
		
		Employee e = new Employee(1, "xyz", 100);
		System.out.println(e);
		System.out.println("hashcode of Employee = " + e.hashCode());
		
		Employee e2;
		e2 = e;
		System.out.println(e2);
		System.out.println("hashcode of Employee = " + e2.hashCode());
		
		String s = "Hi";
		String s2 = "HI";
		
		System.out.println(s.equals(s2));
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		Employee e4 = new Employee(1, "xyz", 100);
		Employee e5 = new Employee(1, "xyz", 100);
		
		System.out.println(e4.equals(e5));
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		
		
		
		

	}

}
