package com.basic;

public class Variable {
	
	int a = 10; // instance variable
	
	static int b = 20; // static variable
	
	public static void main(String[] args) {
		
		// use of local variable -> within class or methods and access variable directly
		int c = 30; 
		System.out.println("Access local vaiable: " + c );

		// use of instance variable -> inside a class and access through object
		Variable v = new Variable();
		System.out.println("Access instance variable: " + v.a);
		
	    // use of static variable -> memory management and no need of object
		System.out.println("Access static variable: " + b);

	}
}




