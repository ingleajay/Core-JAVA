package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaRefelectionArray {

	public static void main(String[] args) {
		
		int size = 5;
		int[] reflect = (int[]) Array.newInstance(int.class,size);
			Array.setInt(reflect, 0, 110);
			Array.setInt(reflect, 1, 20);
			Array.setInt(reflect, 2, 40);
			Array.setInt(reflect, 3, 27);
			Array.setInt(reflect, 4, 50);
			
			// printing array reflection : 
			
		    for (int i : reflect) {
				System.out.println(i);
			}
		    
		    System.out.println("Element at index 0: "
                    + Array.getInt(reflect, 0));
            System.out.println("Element at index 1: "
                    + Array.getInt(reflect, 1));
            System.out.println("Element at index 2: "
                    + Array.getInt(reflect, 2));
            System.out.println("Element at index 3: "
                    + Array.getInt(reflect, 3));
            System.out.println("Element at index 4: "
                    + Array.getInt(reflect, 4));
            
            System.out.println(Arrays.toString(reflect));

	}

}
