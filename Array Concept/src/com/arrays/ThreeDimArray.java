package com.arrays;

public class ThreeDimArray {

	public static void main(String[] args) {
		
		int[][][] t = {{{1, -2, 3}, {2, 3, 4}}, { {-4, -5, 6}, {1,2,3,4}, {2, 3}} };
		for (int[][] array2D: t) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item + " ");
                }
                System.out.println(" ");
            }
        }
	}
	
	// Task - cal sum of each row value
}
