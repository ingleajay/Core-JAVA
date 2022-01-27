package com.methods;

public class Calculator {

	public static void main(String[] args) {
		
		 // Methods in 4 types : 
		 // ->  1. no argument, no return
		 // ->  2. with argument, no return
		 // ->  3. no argument, with return
		 // ->  4. with argument, with return
		
		// two ways to create methods => 
        // using static method
		// using instance method
		
		// instance method - we need object to call method
		Calculator c = new Calculator();
		c.add();
		c.sub(100, 90);
		int res1 = c.div();
		System.out.println("Division :"+res1);
		int res2 = c.mul(20,30);
		System.out.println("Multiplication :"+res2);
		
		// static method -  we don't need object , use for memory managemnt
		add1();
		sub1(100,56);
		int res3 = mul1(20,30);
		System.out.println("Multiplication by static :"+res3);
		int res4 = div1();
		System.out.println("Division by static :"+res4);
		
		// from other class
		int res5 = Services.add(20, 30);
		System.out.println("Addition by Services class : " + res5);
		Services s = new Services();
		int res6 = s.sub(100, 20);
		System.out.println("Substarction by services class : " + res6);
	}
	
	private void add() { // no argument, no return
		int a = 10;
		int b = 20;
		int res = a+b;
		System.out.println("Addition :"+res);
	}
	
	private void sub(int a, int b) { // with argument, no return
		int res = a-b;
		System.out.println("Substraction :"+res);
	}
	
	private int mul(int i, int j) { // with argument, with return
		int res = i*j;
		return res;
	}

	private int div() { // no argument, with return
		int a = 100;
		int b = 20;
		int res = a/b;
		return res;
	}
	
	private static void add1() { // no argument, no return
		int a = 10;
		int b = 20;
		int res = a+b;
		System.out.println("Addition by static :"+res);
	}
	
	private static void sub1(int a, int b) { // with argument, no return
		int res = a-b;
		System.out.println("Substraction by static :"+res);
	}
	
	private static int mul1(int i, int j) { // with argument, with return
		int res = i*j;
		return res;
	}
	
	private static int div1() { // no argument, with return
		int a = 100;
		int b = 20;
		int res = a/b;
		return res;
	}
}
