package com.citibank.exception;

public class InvalidEmployeeSalaryException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Invalid Employee Salary Exception : Salary must be positive Number";
	}

}
