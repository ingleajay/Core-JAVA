package com.java8;

@FunctionalInterface // used to make sure that it is functional interface
public interface Services {

	public int square(int a);
	static void add(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}
}


