package com.contolstatement;

public class IfStatement {

	public static void main(String[] args) {
		
		// If Statement
		
		int stud_age = 20;
        if (stud_age > 18) {
            System.out.println("Student allowed for party.");
        } 
        
        
        // If-else Statement
        
        int stud_mark= 90;
        if (stud_mark < 75) {
            System.out.println("you will not get chocolate.");
        }
        else {
            System.out.println("you will get chocolate.");
        }
        
        
        // If-else ladder statement
        
        int stud_id = 120;
        if (stud_id < 101) {
            System.out.println("This student is does not exists.");
        } else if (stud_id >= 101 && stud_id <= 110) {
            System.out.println("This student is in music team.");
        } else if (stud_id >= 111 && stud_id <= 120) {
            System.out.println("This student is in sports team ");
        } else if (stud_id >= 121 && stud_id <= 130) {
            System.out.println("This student is in dancing team ");
        } else {
            System.out.println("This student is in drama team ");
        }

        // Nested-if ladder statement
        
        int id = 123;
        int mark = 87;
        if (id < 101) {
            System.out.println("This student is does not exists.");
        } else if (mark >= 50 && mark <= 70) {
            if (id >= 101 && id <= 110) {
                System.out.println("This student is in music team.");
            }
        } else if (mark >= 71 && mark <= 85) {
            if (id >= 111 && id <= 120) {
                System.out.println("This student is in sports team ");
            }
        } else if (mark >= 86 && mark <= 100) {
            if (id >= 121 && id <= 130) {
                System.out.println("This student is in dancing team ");
            }
        } else {
            System.out.println("This student is in drama team ");
        }
        
	}

}
