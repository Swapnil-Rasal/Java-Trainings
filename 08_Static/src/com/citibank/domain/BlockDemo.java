package com.citibank.domain;

public class BlockDemo {
	{
		System.out.println("non-static block called");
	}

	public BlockDemo() {
		System.out.println("Default constructor Called");
	}
	
	static {
		System.out.println("static block called");
	}
	
	public static void show() {
		System.out.println("static method called");
	}
	
	public void display() {
		System.out.println("non static method called");
	}
	
}
