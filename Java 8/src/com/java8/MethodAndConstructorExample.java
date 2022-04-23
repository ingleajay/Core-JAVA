package com.java8;

import java.util.function.BiFunction;

class Calservices{
	public static int add(int a,int b) {
		return (a+b);
	}
}

class ChildClass extends Thread{
	public static void simple() {
		System.out.println("I am child class run override by lambda in runnable");
	}
	public void simple1() {
		System.out.println("I am simple1 for instance method ref");
	}
}

interface operation{
	public int sub(int a, int b);
}

public class MethodAndConstructorExample {
	
	// It is used ofetn used to create simple lambda expression by refrencing exisiting methods
	// replace lambda exp by method ref
	
//	Method reference is used to refer method of functional interface.
	// types : 1. ref a static method, ref a instance method, ref to constructor
//	1. It uses for to use existing methods in code.
//	2. if static method ⇒ classname : : method name
//	3. if instance method ⇒ obj name : : method name
//	4. if constrctor ⇒ classname :: new
//	    → if method returns object
//	4. just care about method argument must be same of ref method. ex run () and m1() should have same arg

	
	public static int minus(int a, int b) {
		return (a-b);
	}

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> adder = (a,b) -> {return (a+b);}; // override method using lambda
		System.out.println(adder.apply(10, 20));
		
		// use method refrence - static 
		BiFunction<Integer, Integer, Integer> adder1 = Calservices::add;
		System.out.println(adder1.apply(30, 20));
		
		// understand by thread example
		Runnable r1 = () -> {
			System.out.println("I am child class run override by lambda in runnable simple");
		};
		Thread f1 = new Thread(r1);
		f1.start();
		
		// use method ref for above thread with static
		Runnable r = ChildClass::simple; // run method refer to simple method
		Thread f = new Thread(r);
		f.start();
		
		// use method ref for above thread with non static
		ChildClass c = new ChildClass();
		Runnable r2 = c::simple1; // run method refer to simple method
		Thread f2 = new Thread(r2);
		f2.start();
		
		// use sub method for others and reduce your code
		operation p = (a,b)-> {return (a-b);};
		int res1 = p.sub(20, 10);
		System.out.println(res1);
		
		// use method ref
		operation p1 = MethodAndConstructorExample::minus;
		int res2 = p1.sub(40, 12);
		System.out.println(res2);
	}

}
