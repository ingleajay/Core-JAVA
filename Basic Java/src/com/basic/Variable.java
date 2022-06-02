package com.basic;

public class Variable {
	
	int a = 10; // instance variable
	
	static int b = 20; // static variable
	
	public static void main(String[] args) {
		
		// use of local variable -> A variable declared inside the body of the method is called local variable.
		int c = 30; 
		System.out.println("Access local vaiable: " + c );

		// use of instance variable ->A variable declared inside the class but outside the body of the method, is called an instance variable
		Variable v = new Variable();
		System.out.println("Access instance variable: " + v.a);
		
	    // use of static variable -> memory management and no need of object
		// -> You can create a single copy of the static variable and share it among all the instances of the class.
		// -> Memory allocation for static variables happens only once when the class is loaded in the memory	
		System.out.println("Access static variable: " + b);

	}
}




