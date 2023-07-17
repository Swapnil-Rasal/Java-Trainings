package com.citibank.main;

import com.citibank.domain.ChildClass;
import com.citibank.domain.MyClass;

public class ChildClassMain {
	public static void main(String[] args) {
		//cannot create object of abstract class
		//MyClass myClass = new MyClass();
		
		ChildClass childClass = new ChildClass();
		childClass.show();
	}

}
