package com.oops;

@FunctionalInterface
interface Calservice {
	void cube(int a);
	
	default void square(int a) {
		System.out.println("Square of Number : " + (a*a));
	}
	
	static void reactangle(int l ,int b) {
		System.out.println("Area of Reactangle: " + (l*b));
	}
}


public class InterfaceFunctional implements Calservice {

	public static void main(String[] args) {
		
		// without lamda expression
		Calservice c1 = new Calservice() {
			@Override
			public void cube(int a) {
				System.out.println("Cube of Number 2 : " + (a*a*a));
			}
		};
		c1.cube(30);
		
		Calservice c2 = new InterfaceFunctional();
		c2.cube(40);
		
		
		// with lambda expression 
		Calservice c = (a) -> {
			System.out.println("Cube of Number 1 : " + (a*a*a));
		};
	
		c.cube(10);
		c.square(10);
		Calservice.reactangle(10, 20);
	}

	@Override
	public void cube(int a) {
		System.out.println("Cube of Number 3: " + (a*a*a));
	}
}
