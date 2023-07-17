package com.citibank.main;

import java.util.Locale;

import com.citibank.domain.ProcessString;

public class ProcessStringMain {
	public static void main(String[] args) {
		String text = "LambdaExpression";
		String updatedstring;
		String Count;
		
		ProcessString lowerToUpper = (str) -> str.toUpperCase();
		updatedstring = lowerToUpper.doProcess(text);
		System.out.println(updatedstring);
		
		ProcessString lengthOfString = (str) -> "Lengh of Supplied String is : "+str.length();
		Count = lengthOfString.doProcess(text);
		System.out.println(Count);
		
		//ProcessString repeatString = (str) -> (str+""+str+""+str);
		ProcessString repeatString = (str) -> str.repeat(4);
		updatedstring = repeatString.doProcess(text);
		System.out.println(updatedstring);
	}
}
