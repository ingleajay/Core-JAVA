package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaRefelectionArray {

	public static void main(String[] args) {
		
		// # The Java Reflection class provides static methods, and these methods can be used to create and access Java arrays in a dynamic manner.
		// it is ensures your type of data - type-safe at runtime
		
		   int size = 5;
		   int[] reflect = (int[]) Array.newInstance(int.class,size); // (component type, length)
			Array.setInt(reflect, 0, 110);
			Array.setInt(reflect, 1, 20);
			Array.setInt(reflect, 2, 40);
			Array.setInt(reflect, 3, 27);
			Array.setInt(reflect, 4, 50);
			
			// printing array reflection : 
			
		    for (int i : reflect) {
				System.out.print(i + " ");
			}
		    System.out.println();
		    
		   for(int i=0; i<reflect.length;i++) {
			   System.out.println("Element at index " + i + " is " + Array.getInt(reflect, i) );
		   }
            
            System.out.println(Arrays.toString(reflect));
            
            // Two dim
            
            int[][] m = (int[][]) Array.newInstance(int.class, 2, 2);
            int[] row1 = (int[]) Array.get(m,0);
            int[] row2 = (int[]) Array.get(m,1);
            Array.setInt(row1, 0, 110);
			Array.setInt(row1, 1, 20);
			Array.setInt(row2, 0, 40);
			Array.setInt(row2, 1, 27);
			for (int i = 0; i < 2; i++)
	            for (int j = 0; j < 2; j++) {
	                System.out.println("matrix" + " [" + i + "]" + " [" + j + "]" + " = " + ((int[][])m)[i][j]);
	        }
            
	}
}
