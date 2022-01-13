package com.contolstatement;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// Generated student id in Student class.
		int stud_id = 0;
        do {
            System.out.println("Student id " + stud_id + " is generated ");
            stud_id++;
        } while (stud_id < 10);
        System.out.println(" ");
        
        // Create a student array to store marks and print them.
        int stud_mark[] = { 90, 80, 97, 78, 67 };
        int id = 0;
        do {
            System.out.println("student id " + (id) + " mark is " + stud_mark[id]);
            id++;
        } while (id < stud_mark.length);
	}

}
