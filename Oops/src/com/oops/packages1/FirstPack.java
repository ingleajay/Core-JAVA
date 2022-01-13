package com.oops.packages1;

import static java.lang.System.*;

public class FirstPack {

	public static void main(String[] args) {
		System.out.println("This is my package example here..");
		
		// use static import
		out.println("This is static import packages example");
	}
	
	// if not used ide then -
	// complie - javac -d directory javafilename   - > javac -d . Simple.java
	// run -  java mypack.Simple
	
	public void msg(){System.out.println("I am package One");}  
}
