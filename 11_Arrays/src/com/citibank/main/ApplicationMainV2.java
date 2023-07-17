package com.citibank.main;

import com.citibank.domain.ApplicationV2;

public class ApplicationMainV2 {

	public static void main(String[] args) {
		String[] cars = new String[5];
		
		cars[0] = "Nexon";
		cars[1] = "Breeza";
		cars[2] = "Seltos";
		cars[3] = "Sonet";
		cars[4] = "Thar";
		
		ApplicationV2 applicationV2 = new ApplicationV2(cars);
		applicationV2.process();
		applicationV2.display();

	}

}
