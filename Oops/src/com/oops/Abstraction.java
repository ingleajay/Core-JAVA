package com.oops;

abstract class Cycle {
	
	public abstract void driving();
	
	public void servicing() {
		System.out.println("Cycle servicing : This implementation is to be shown");
	}
	
	Cycle(){
		System.out.println("This is abstract class contructor");
	}
}

public class Abstraction extends Cycle{ 

	public static void main(String[] args) {
		
		//Abstraction is a process of hiding the implementation details and showing only functionality to the user. (implementation hiding)
		// ex. ATM - swap card -> choose option -> enter money and get money 
	    // -> we are unable to find out how it is processing request, which database uses etc..at backend
		
		
		/*
		Advantages of Abstraction
		1. It reduces the complexity of viewing the things.
		2. Avoids code duplication and increases reusability.
		3. Helps to increase the security of an application or program as only important details are provided to the user.
		*/
		
		
		/*Note : 
		1. An abstract class is a class that is declared with an abstract keyword.
		2. An abstract method is a method that is declared without implementation.
		3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods
		4. A method defined abstract must always be redefined in the subclass.
		5. Any class that contains one or more abstract methods must also be declared with an abstract keyword.
		6. There can be no object of an abstract class
		7. An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.
		*/
		
		// type 1:
		// Cycle bmw = new Cycle(); // abstract class not have object - error
		
		// type 2:
		Cycle cy = new Cycle() {			
			@Override
			public void driving() {
				System.out.println("Cycle driving : using implemetation inside abstract class object body");	
			}	
		};
		cy.driving();
		cy.servicing();
		
		// type 3:
		Cycle cyc = new Abstraction();
		cyc.driving();
		cyc.servicing();
		
		// type 4;
		Abstraction abs = new Abstraction();
		abs.driving();
		abs.servicing();
	}

	@Override
	public void driving() {
		System.out.println("Cycle driving : implementation of driving class of abstract method");
	}
}
