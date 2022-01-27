package com.basic;

public class CommandLineArgExample {

	public static void main(String[] args) {

		// Command Line Argument : take input from console

		// args - arguments has datatype of string of array
		// array always get value through index

		/*
		 * System.out.println("First argument : " + args[0]);
		 * System.out.println("Second argument : " + args[1]);
		 * System.out.println("Third argument : " + args[2]);
		 */

		// get length of args array
		System.out.println("Get length of args array : " + args.length);
		
		// type of args
		System.out.println("Get class of args : " + args.getClass());

		// Task : do division of number
        // convert : string to float
		float n1 = Float.parseFloat(args[3]);
		float n2 = Float.parseFloat(args[4]);
		System.out.println("Divison : " + (n1/n2));

	}

}
