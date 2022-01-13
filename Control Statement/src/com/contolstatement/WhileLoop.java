package com.contolstatement;

public class WhileLoop {

	public static void main(String[] args) {
		
		//Generated student id in Student class.
		int stud_id = 0;
        while (stud_id < 10) {
            System.out.println("Student id " + stud_id + " is generated ");
            stud_id++;
        }
        System.out.println(" ");
        
        
        //Create a student array to store marks and print them.
        int stud_mark[] = { 90, 80, 97, 78, 67 };
        int id = 0;
        while (id < stud_mark.length) {
            System.out.println("student id " + (id) + " mark is " + stud_mark[id]);
            id++;
        }
        
        
        // infinite loop
        int stdid = 10;
        while (stdid > 0) {
            System.out.println("Student id " + stdid + " is generated ");
            stdid++;
        }
        
        int stuid = 10;
        while (true) {
            System.out.println("Student id " + stuid + " is generated ");
            stuid++;
        }
	}
}
