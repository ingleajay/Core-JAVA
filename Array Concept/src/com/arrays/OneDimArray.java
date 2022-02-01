package com.arrays;

public class OneDimArray {

	public static void main(String[] args) {
		
		 // one dimensional array
		  int[] arr;
		  arr = new int[5];
		  
		 // int[] arr = new int[5];
		  
		 // int[] arr = {10,20,30,40,50};
		  
		  arr[0] = 10;
	      arr[1] = 20;
	      arr[2] = 33;
	      arr[3] = 40;
	      arr[4] = 55;
	         
	      // for loop
	      for (int i = 0; i < arr.length; i++)
	         System.out.println("By for loop : " + arr[i]);  
	      
	      // for each
	      for(Integer ele : arr) {
	    	  System.out.println("By for each : " +ele);
	      }
	      
	      // Task : sum of all numbers in array using both for loop and for each
	      int sum1 = 0,sum2=0;
	      for (int i = 0; i < arr.length; i++) {
	    	     sum1 = sum1 + arr[i];
	      }
	      System.out.println("Sum1 : " + sum1);  
		  // for each
		  for(Integer ele : arr) {
		    	  sum2 = sum2 + ele;
		  }
		  System.out.println("Sum2 : " + sum2);
		  
		  // find even no from array
		  for (int i = 0; i < arr.length; i++) {
	    	    if(arr[i]%2==0) {
	    	    	System.out.println("even no at  "+ i + " - " + arr[i]);
	    	    }
	      }

		  // Task - get five string from user and calculate length of each
	}
}
