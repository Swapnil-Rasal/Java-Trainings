package com.citibank.domain;

public class ChildClass extends MyClass{
	public ChildClass() {
		System.out.println("Default constructor of ChildClass");
	}

	@Override
	public void show() {
		System.out.println("show() of ChildClass");
		
	}
	

}
