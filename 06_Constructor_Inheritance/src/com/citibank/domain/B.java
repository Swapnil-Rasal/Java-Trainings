package com.citibank.domain;

public class B extends A{
	public B() {
		super();
		System.out.println("Default constructor of B");
	}
	public B(int x) {
		super(x);
		System.out.println("Parameterized constructor of B");
		System.out.println("x = " + x);
	}
}
