package com.citibank.domain;

import java.util.Comparator;

public class SortByLastName implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int diff = p1.getLastName().compareTo(p2.getLastName());
		return diff;
	}

}
