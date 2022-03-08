package com.oops.packages1;

public class PrivateAccessAtmPin {

	public static void main(String[] args) {
		
		// 1. Private Modifier :  The access level of a private modifier is only within the class. 
		// It cannot be accessed from outside the class.
		
		PrivateAtmPin atm = new PrivateAtmPin();
		// System.out.println(atm.pin);
	}
}
