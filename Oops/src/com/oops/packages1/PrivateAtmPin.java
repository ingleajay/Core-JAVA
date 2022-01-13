package com.oops.packages1;

public class PrivateAtmPin {
	
	// This is private data members and method access only within class

	private int pin=4044;  
	
    private void msg(){
    	System.out.println("Atm Pin Number : " + pin);
    } 
    
//    public static void main(String[] args) {
//		new AtmPin().msg();;
//	}
    
}
