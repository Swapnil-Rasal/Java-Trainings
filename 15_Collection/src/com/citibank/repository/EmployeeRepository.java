package com.citibank.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	Employee employee = new Employee();
	boolean result;
	private Set<Employee> employeeSet = new HashSet<Employee>();
	
	public boolean addnewEmployee(Employee employee) {
		return employeeSet.add(employee);
	}
	
	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
	
	public Employee searchEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeId()== employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	public boolean updateEmployeeSalary (int employeeId, double newSalary) {
		
		employee = searchEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employee.setSalary(newSalary);
			return true;
		}
		return false;
	}
	
	public boolean deleteEmployeeByEmployeeId (int employeeId) {
		Employee employee = searchEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			employeeSet.remove(employee);
			return true;			
		}
		return false;
	}

}
