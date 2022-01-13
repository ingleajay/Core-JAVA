package com.oops;

public class ConstructorOverloading {
	
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
