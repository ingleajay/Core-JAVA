package com.arrays;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		int arr[] = {1,3,0,12,10};
		
		Arrays.sort(arr);
		System.out.println("Sorted array : " + Arrays.toString(arr));
		
		int search = 3;
		int index = Arrays.binarySearch(arr, search);
		System.out.println("Search element present at index : " + index);
		
		int arr1[] = {3,1,0,10,12};
		int value = Arrays.compare(arr, arr1);
		System.out.println("Test two array in same order : " + value);
		
		int[] len = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(len));
		
	}

}
