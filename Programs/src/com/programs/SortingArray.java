package com.programs;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// Task - sort an array
		int a[] = { 10, 20, 100, 0, 89 };

		// Method 1 : use Arrays
		//Arrays.sort(a);
		System.out.println("Sorted array 1 : " + Arrays.toString(a));

		// Method 2 :use method
		int[] res = sortarray(a);
		System.out.println("Sorted array 2: " + Arrays.toString(res));
	}

	private static int[] sortarray(int[] arr) {
		for (int i = 0; i < arr.length; i++)   
		{  
		  for (int j = i + 1; j < arr.length; j++)   
		    {  
		      int tmp = 0;  
		      if (arr[i] > arr[j])   
		        {  
		          tmp = arr[i];  
		          arr[i] = arr[j];  
		          arr[j] = tmp;  
		        }  
		    }
	     }
		return arr;
	}	
}
