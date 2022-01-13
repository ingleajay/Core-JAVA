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
		
		// Need of a Method Overriding
		Brother b = new Brother();
        b.care();
	}
}
