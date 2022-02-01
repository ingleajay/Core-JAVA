package com.programs;

public class AddRowValue3 {

	public static void main(String[] args) {
		
		int[][][] t = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6}, {1,2,3,4}, {2, 3}} };
		for (int[][] array2D: t) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item + " ");
                }
                System.out.println(" ");
            }
        }

		int sum = 0;
		for (int[][] array2D: t) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    sum = sum + item;
                }
            }
        }
		System.out.println("Sum of all values in row : " + sum);
	}

}
