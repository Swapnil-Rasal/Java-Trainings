package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(23);
		numbersList.add(43);
		numbersList.add(53);
		numbersList.add(63);
		numbersList.add(23);
		numbersList.add(43);
		
		System.out.println(numbersList);
		System.out.println("Lenth of Arraylist "+ numbersList.size());
		System.out.println(numbersList.contains(23));
		System.out.println(numbersList.indexOf(63));
		
		numbersList.remove(3);
		
		System.out.println("Lenth of Arraylist "+ numbersList.size());
		
		for (Integer integer : numbersList) {
			System.out.println(integer);
		}
		
		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Swapnil");
		nameSet.add("Param");
		nameSet.add("Aaditya");
		nameSet.add("Tanu");
		nameSet.add("Gautami");
		nameSet.add("Swapnil");
		nameSet.add("Saurabh");
		nameSet.add("Tanu");
		nameSet.add("Govinda");
		nameSet.add("Radhika");
		nameSet.add("Param");
		nameSet.add("Bharat");
		
		System.out.println(nameSet);
		
		System.out.println("3. TreeSet");
		TreeSet<String> sortedNameSet = new TreeSet<String>();
		
		sortedNameSet.add("Swapnil");
		sortedNameSet.add("Param");
		sortedNameSet.add("Aaditya");
		sortedNameSet.add("Tanu");
		sortedNameSet.add("Gautami");
		sortedNameSet.add("Swapnil");
		sortedNameSet.add("Saurabh");
		sortedNameSet.add("Tanu");
		sortedNameSet.add("Govinda");
		sortedNameSet.add("Radhika");
		sortedNameSet.add("Param");
		sortedNameSet.add("Bharat");
		
		
		System.out.println(sortedNameSet);
		
		System.out.println("4. HashMap");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(101, "Aaditya");
		hashMap.put(102, "Param");
		hashMap.put(103, "Swapnil");
		hashMap.put(104, "Gautami");
		hashMap.put(105, "Tanu");
		hashMap.put(106, "Radhika");
		hashMap.put(107, "Abdul");
		hashMap.put(108, "Param");
		hashMap.put(102, "Govinda");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(103));
		
		
		
		
		
	}

}
