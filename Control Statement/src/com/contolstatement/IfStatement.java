package com.contolstatement;

public class IfStatement {

	public static void main(String[] args) {
		
		// If Statement - used when we have single condition to check
		int a = 3;
		int b = 4;
		if(a>b) {
			System.out.println(a +  " is greater" + b);
		}
		
		// Task 
		// student , party in college, 18+ age => notice, annoucemenet
		int stud_age = 20;
        if (stud_age > 18) {
            System.out.println("Student allowed for party.");
        } 
        
        
        // If-else Statement - we have sigle condition to check and it's has both possiblities
        int c = 5;
        int d = 2;
        if(c%d == 0) {
        	System.out.println(d + " is divisble to " + c);
        }
        else {
        	System.out.println(d + " is not divisble to " + c);
        }
        
        // Task - student , had given exam, 
        int stud_mark= 90;
        if (stud_mark < 75) {
            System.out.println("you will not get shoes.");
        }
        else {
            System.out.println("you will get shoes.");
        }
        
        
        // If-else ladder statement - if we have multiple condition to check
        // student -> had given exam -> ( grade -> A, B, C ) -> Prize -> ( Bike, Shoes, Book )
        char stud_grade = 'A';
        if(stud_grade == 'A') {
        	System.out.println("Student will get bike");
        }
        else if(stud_grade == 'B') {
        	System.out.println("Student will get sports shoes ");
        }
        else if(stud_grade == 'C') {
        	System.out.println("Student will get book to read");
        }

        // Task
        // studnets -> we have total 101-130 students
        // roll no -> ( 101, 110) -> music team
        // roll no -> ( 111, 120) -> sports team
        // roll no -> ( 121, 130) -> dancing team
                
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
            System.out.println("This is no other team assign to student");
        }
        
        
        // nested if statement - check condition after one another
        int e = 30;
        if(e > 20) {
        	if(e%2 == 0) {
        		System.out.println(e + " is number greater than 20 and even number");
        	}
        }
        
        // task
        // students -> give exam -> 1. college name -> 2. unique number
        String stud_college = "RAIT";
        int stud_no = 12345;
        if(stud_college == "RAIT") {
        	if(stud_no == 12345) {
        		System.out.println("Students allowd to write exam ");
        	}
        }
        
        // Nested-if ladder statement
        // vending machine - it is automatic machine and gives you item after insert coin
        // note = ( 10, 20, 50) -> ( Chips, biscuits, snickers) -> on basis of payement_status
        String payment_status = "Done";
        int coin = 10;
        if(payment_status == "Done") {
        	if(coin == 10) {
        		System.out.println("Produce chips...");
        	}
        	else if(coin == 20) {
        		System.out.println("Produce biscuits...");
        	}
        	else if(coin == 30) {
        		System.out.println("Produce snickers...");
        	}
        }

        // Task - 
        // studnets -> we have total 101-130 students -> one condition -> enter in team give exam 
        // roll no -> ( 101, 110) -> music team  -> marks -> ( 50, 70)
        // roll no -> ( 111, 120) -> sports team -> marks -> ( 71, 85)
        // roll no -> ( 121, 130) -> dancing team -> marks -> ( 86, 100)
        // others will in drama team
        
        int id = 123;
        int mark = 87;
        if (id < 101) {
            System.out.println("This student is does not exists.");
        } else if (id >= 101 && id <= 110) { 
            if (mark >= 50 && mark <= 70) {
                System.out.println("This student is in music team.");
            }
        } else  if (id >= 111 && id <= 120) {
        	if (mark >= 71 && mark <= 85) {
                System.out.println("This student is in sports team ");
            }
        } else if (id >= 121 && id <= 130) { 
            if (mark >= 86 && mark <= 100) {
                System.out.println("This student is in dancing team ");
            }
        } else {
            System.out.println("This student is in drama team ");
        }
        
	}

}
