package com.basic;

import java.util.Arrays;

public class DiffOfPrimitiveAndNonPrimitive {

	public static void main(String[] args) {
		
		 // int is primitive data type
		 int x = 10;
	     int y = x;
	     System.out.println("Intial Value: " +  "x = " + x + ", y = " + y);
	     
	     y = 30; // change value of y will not affect to x
	     System.out.println("After Value: " + "x = " + x + ", y = " + y);
	     System.out.println(" ");
	     
	     // Note : Change does not reflect in the original ones.
	     
	     // Array is non primitive data type
	     int[] c = { 10, 20, 30, 40 };
	     int[] d = c;
	     //both point to same memory in Heap
	     System.out.println("Intial: "+ "c: "+ Arrays.toString(c) + 
	    		 " d: " + Arrays.toString(d));
	     
	     d[1] = 50;
	     System.out.println("After: " + "c: "+ Arrays.toString(c) + 
	    		 " d: " + Arrays.toString(d));

	     // Note: Changes reflected in the original ones.

	}

}
