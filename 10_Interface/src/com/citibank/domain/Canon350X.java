package com.citibank.domain;

public class Canon350X extends PrinterDriver implements UpdateOne{

	public void print() {
		System.out.println("Canon350X is printing");
		
	}

	public void borderlessPrinting() {
		System.out.println("Canon350X is doing borderless printing");
	}
	
}
