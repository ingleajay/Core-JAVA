package com.arrays;

import java.util.Arrays;

public class SimpleArrayConcept {

	public static void main(String[] args) {
		
		int arr[]={3,2,4,5};  
		
		// For-each Loop and for-each for Java Array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i:arr)  
			System.out.print(i + " "); 
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		// Passing Array to a Method in Java
		// Task - find min number from array
		int res = min(arr);
		System.out.println("Min : " + res);
		  
		// Anonymous Array in Java
		// -> you don't need to declare the array while passing an array to the method.
		
		// Task - find max number from array
		 int r = max(new int[] {2,1,3,4,5});
		 System.out.println("Max : " + r); 
		 
		// Returning Array from the Method
		// task double array value and return 
		 
		 int[] s = doublevalue();
		 System.out.println(Arrays.toString(s));
		}

	private static int[] doublevalue() {
		int[] a = {10,20,30,40};
		for(int i=0;i<a.length;i++) {
			a[i] = 2*(a[i]);
		}
		return a;
	}

	private static int max(int[] arr) {
		int max=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(max<arr[i]) 
		   max=arr[i];  
		return max;
	}

	private static int min(int[] arr) {
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i]) 
		   min=arr[i];  
		return min;
	}
	// min = 3 , 3>2 , min=2
	// min = 2 , 2>4 failed
}
