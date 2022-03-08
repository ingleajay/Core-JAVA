package com.programs;

public class ConstructorProgram {

	public ConstructorProgram(int a, int b) {
		
		int res = add(a,b);
		System.out.println("Addition : " + res );
	}

	private int add(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {

		// method - add but use constructor
		int a = 10;
		int b = 20;
		ConstructorProgram c = new ConstructorProgram(a,b);
		
	}

}
