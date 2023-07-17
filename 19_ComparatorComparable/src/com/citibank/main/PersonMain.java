package com.citibank.main;

import java.security.PublicKey;
import java.util.Arrays;

import com.citibank.domain.Person;
import com.citibank.domain.SortByLastName;

interface Condition {
	boolean test (Person person);
}


public class PersonMain {
	public static void printAll (Person[] people, Condition condition)	{
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}

	}
	
	public static void printAllBeginWithG (Person[] people)	{
		for (Person person : people) {
			if (person.getLastName().startsWith("G"))
			System.out.println(person);
		}

	}
	
	public static void printAllEndWithL (Person[] people)	{
		for (Person person : people) {
			if (person.getLastName().endsWith("l"))
			System.out.println(person);
		}

	}

	public static void main(String[] args) {
		Person person1 = new Person("Vivek", "Gohil", 33);
		Person person2 = new Person("Gurubux", "Gill", 26);
		Person person3 = new Person("Samarth", "Patil", 12);
		Person person4 = new Person("Trupti", "Acharekar", 38);

		Person[] persons = {person1, person2, person3, person4};
		
//		System.out.println("Menu -");
//		System.out.println("1. Display all Person names in array ");
//		System.out.println("2. Display Person Last names begins with G");
//		System.out.println("3. Display Person Last names Ends with L");
		
		
		System.out.println("-----------------------------------");	
		System.out.println("Person Array Before Sort :");
		System.out.println();
		Condition noCondition = (p) -> true;
		printAll(persons,noCondition);
		
		SortByLastName byLastName = new SortByLastName();
		Arrays.sort(persons,byLastName);
		
		System.out.println("-----------------------------------");	
		System.out.println("Person Array After Sort :");
		System.out.println();
		printAll(persons,noCondition);
		
		System.out.println("-----------------------------------");	
		System.out.println("Person's Last Names starts with G :");
		System.out.println();
		Condition startWithG = (p) -> {
			if(p.getLastName().startsWith("G")) {
				return true;
			}
			return false;
		};
		printAll(persons, startWithG);
		
		System.out.println("-----------------------------------");	
		System.out.println("Person's Last Names ends with L :");
		System.out.println();
		Condition endsWithL = (p) -> {
			if(p.getLastName().endsWith("l")) {
				return true;
			}
			return false;
		};
		printAll(persons, endsWithL);
								
	}

}
