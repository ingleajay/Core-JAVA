package com.java8;

public class ExampleMethodRef {

	public static void main(String[] args) {
		
		// find absolute value => number is always positive
		operation p1 = MethodAndConstructorExample::minus;
		int sub = p1.sub(12, 40);
		int abs;
		if(sub > 0) {
			abs = sub;
		}
		else {
			abs = -sub;
		}
		System.out.println("Absolute value : " + abs);
	}

}
