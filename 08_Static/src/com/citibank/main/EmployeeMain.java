package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.domain.MyClass;

public class EmployeeMain {
	
	static int x=10;
	public static void main(String[] args) {
		
		System.out.println(x);
		
			
		Employee e1 = new Employee("Swapnil", 10000);
		Employee e2 = new Employee("Param", 20000);
		Employee e3 = new Employee("Aditya", 30000);
		Employee e4 = new Employee("Gautami", 40000);
		Employee e5 = new Employee("Tanu", 50000);
		
		System.out.println(e1);		
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		MyClass.display();

	}

}
