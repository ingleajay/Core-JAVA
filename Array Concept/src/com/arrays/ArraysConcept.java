package com.arrays;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		// java.util.Arrays class contains various static methods for manipulating arrays. 
		// The manipulation includes searching, sorting, list view of an array and others.
		// it is used in collections
		
		int arr[] = {3,3,0,12,10};
		
		// sort array ele
		Arrays.sort(arr);
		System.out.println("Sorted array : " + Arrays.toString(arr));
		
		// use binary search
		int search = 3;
		int index = Arrays.binarySearch(arr, search);
		System.out.println("Search element present at index : " + index);
		
		// copy array till index
		int[] len = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(len));
		
		// fill value in array all
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));

	}
}
