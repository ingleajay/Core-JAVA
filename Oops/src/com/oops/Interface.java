package com.oops;

abstract class MainVechicleServices {
	void driving() {
		System.out.println("This is driving..");
	}
	
	abstract void horning();
}

interface Vechicle1 {
	void servicing();
}

interface Vechicle2{
	void reparing();
}

class Lamborghini extends MainVechicleServices implements Vechicle1,Vechicle2{
	
	@Override
	public void reparing() {
		System.out.println("Lamborghini is reparing");
	}

	@Override
	public void servicing() {
		System.out.println("Lamborghini is servicing");
	}

	@Override
	void horning() {
		System.out.println("Lamborghini is horning");
	}
	
	// method overriding
	void driving() {
		System.out.println("Lamborghini is driving");
	}
}


public class Interface {
	
	public static void main(String[] args) {
		
		// Multiple inheritance 
		Lamborghini l =new Lamborghini();
		l.reparing();
		l.servicing();
		
		// hybrid Inheritance
		l.horning();
		l.driving();
		
		
	}

}
