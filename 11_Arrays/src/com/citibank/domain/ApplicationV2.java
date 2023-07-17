package com.citibank.domain;

public class ApplicationV2 {
	private String[] cars;
	
	public ApplicationV2() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationV2(String[] cars) {	
		this.cars = cars;
	}

	public String[] getCars() {
		return cars;
	}

	public void setCars(String[] cars) {
		this.cars = cars;
	}
	
	public void process() {
		for(int i=0;i< cars.length;i++) {
			cars[i] = cars[i].toUpperCase();
		}
	}
	
	public void display () {
		for (String car : cars) {
			System.out.println(car);
		}
	}
	

}
