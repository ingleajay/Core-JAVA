package com.oops;

public class ConstructorOverloading {
	
	// Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
	// They are arranged in a way that each constructor performs a different task. 
	
	ConstructorOverloading(int id){
		System.out.println("This is student ID : " +id);
	}
	
	ConstructorOverloading(float marks){
		System.out.println("This is student marks : " + marks);	
	}

	public static void main(String[] args) {
		
		ConstructorOverloading Std_ID = new ConstructorOverloading(400);
		ConstructorOverloading Std_Marks = new ConstructorOverloading(94.45f);
	}

}
