package com.oops;

class Family {
    void care1() {
        System.out.println("I am family class takes care of everyone.");
    }
    
    void care() {
        System.out.println("I am family class takes care of everyone.");
    }
}

class Brother extends Family {
	
    void care2() {
    	 // super.care1(); -> if not used method overriding
        System.out.println("I am brother class takes care of my sister.");
    }
    
    void care() {
    	super.care();
        System.out.println("I am brother class takes care of my sister.");
    }
}


public class Overriding {

	public static void main(String[] args) {
		
		/*
		 Overriding : 
			1. If subclass (child class) has the same method as declared in the parent class,
			   it is known as method overriding in Java.
			2. If a subclass provides the specific implementation of the method that 
			   has been declared by one of its parent class, it is known as method overriding.
			Rules for Java Method Overriding
			1. The method must have the same name as in the parent class
			2. The method must have the same parameter as in the parent class.
			3. There must be an IS-A relationship (inheritance).
		 */
		
		// Need of a Method Overriding
		Brother b = new Brother();
        b.care();
	}
}
