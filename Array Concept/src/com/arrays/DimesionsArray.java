package com.arrays;

public class DimesionsArray {

	public static void main(String[] args) {
		// one dimensional array
		  int[] arr;
		  arr = new int[5];
		  // or
		 // int[] arr = new int[5];
		  
		 // int[] arr = {10,20,30,40,50};
		  
		  arr[0] = 10;
	      arr[1] = 20;
	      arr[2] = 30;
	      arr[3] = 40;
	      arr[4] = 50;
	         
	      for (int i = 0; i < arr.length; i++)
	         System.out.println("Element at index " + i +" : "+ arr[i]);  
	      
	   // two dimensional array
	      
	      int row = 3;
          int coll = 3;
		  // int[][] a = new int[row][coll];
          int[][] a= {{10,20,30},{30,40,50},{70,90,40}};
		  
		  for(int i = 0; i< row; i++) {
			 for(int j = 0; j<coll ; j ++) {
					System.out.print(a[i][j]+ " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");   
	}
}
