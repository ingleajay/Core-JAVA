package com.oops;

public class ConstructorChaning {
	
	// Constructor chaining is the process of calling one constructor from another constructor 
	// with respect to current object.  
	
	ConstructorChaning(){
		this(101);
		System.out.println("This is default Constructor chaning");
	}
	
	ConstructorChaning(int i) {
		this(303,202,"Sum of No is : ");
		System.out.println("Number  : " + i);
	}

	ConstructorChaning(int i, int j, String a) {
		int sum = i + j;
		System.out.println(a + sum);
	}

	public static void main(String[] args) {
         new ConstructorChaning();
	}

}
