package com.arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		
		 // two dimensional array
	      
	      int row = 3;
          int coll = 3;
		  // int[][] a = new int[row][coll];
          int[][] a= {{10,20,30},{30,40,50,60},{70,90,40}};
		  
		  for(int i = 0; i< row; i++) {
			 for(int j = 0; j<coll ; j++) {
					System.out.print(a[i][j]+ " ");
				}
				System.out.println(" ");
			}
			System.out.println(" "); 
			
			// Task - matrix addition
	}
}
