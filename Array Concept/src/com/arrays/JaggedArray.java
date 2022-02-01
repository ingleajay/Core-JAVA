package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		// Jagged Array: A jagged array is an array of arrays such that member arrays can be of different sizes.
		
		int[][] arr= {{10,20,30},{30,40,50,70,60,80},{50,60},{70,90,40}};
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr[i].length ; j ++) {
				//add[i][j]= i + j;
				System.out.print(arr[i][j]+ " ");
			}
				System.out.println(" ");
		}
		System.out.println(" ");
	}
}
