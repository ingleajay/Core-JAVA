package com.contolstatement;

import java.util.Arrays;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		
		// For loop is used when a number of the iteration of the program is fixed 
		// if we want to do part of the program repeated multiple times.
		
		
		//  Generated student id in Student class.
		for (int stud_id = 0; stud_id < 5; stud_id++) {
            System.out.println("Student " + stud_id + " generated");
        }
		System.out.println(" ");
		
		
		// Create a student array to store marks and print them.
		int stud_mark[] = { 90, 80, 97, 78, 67 };
        for (int id=0; id<stud_mark.length; id++) {
            System.out.println("student id " + (id) + " mark is " + stud_mark[id]);
        }
        System.out.println(" ");
        
        // Nested for loop - 
        int stud_matrix[][] = { {1,2},{3,4},{5,6} };
        int row = 3;
        int col = 2;
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		System.out.print(stud_matrix[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println(" ");
        
        
        // For Each method
        for (int i : stud_mark) {
            System.out.println("Student Marks : " + i );
        }
        System.out.println(" ");
        
		
        // use java8 for each method - access element from list
        List<Integer> number = Arrays.asList(10,0,20,2);
        number.forEach((i)->System.out.println(i));
        
	}
}
