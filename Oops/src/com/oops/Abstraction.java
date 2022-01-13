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
		
		// Cycle bmw = new Cycle(); // abstract class not have object - error
		
		Cycle cy = new Cycle() {			
			@Override
			public void driving() {
				System.out.println("Cycle driving : using implemetation inside abstract class object body");	
			}	
		};
		cy.driving();
		cy.servicing();
		
		Cycle cyc = new Abstraction();
		cyc.driving();
		cyc.servicing();
		
		Abstraction abs = new Abstraction();
		abs.driving();
		abs.servicing();
	}

	@Override
	public void driving() {
		System.out.println("Cycle driving : implementation of driving class of abstract method");
	}
}
