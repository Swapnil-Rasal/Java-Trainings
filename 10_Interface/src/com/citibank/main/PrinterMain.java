package com.citibank.main;

import com.citibank.domain.Canon350X;
import com.citibank.domain.HP3432;

public class PrinterMain {

	public static void main(String[] args) {
		
		HP3432 hp3432 = new HP3432();
		Canon350X canon350x = new Canon350X();
		
		hp3432.print();
		hp3432.wirelessPrinting();
		
		canon350x.print();
		canon350x.borderlessPrinting();

	}

}
