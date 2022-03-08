package com.contolstatement;

public class Demo {

	public static void main(String[] args) {
		
		// If Statement - used when we have condition to check
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

        // If-else Statement - we have condition to check and it has both possibilities
		// positve or negative
		int n = -1;
		if(n > 0) {
			System.out.println("Number is positve");
		}
		else {
			System.out.println("Number is negative");
		}
		
		// Task - check number is even or odd
		 int c = 5;
	     int d = 2;
	     if(c%d == 0) {
	        	System.out.println(d + " is divisble to " + c);
	     }
	     else {
	        	System.out.println(d + " is not divisble to " + c);
	     }
		
	     
	     // If-else ladder statement - if we have multiple condition to check
	     // largest number among three number - a, b, c
	     
	     int a1 = 1, a2=10 , a3=-1;
	     if(a1>a2 && a1 > a3) {
	    	 System.out.println(a1 + " is largest number");
	     }
	     else if(a2>a1 && a2>a1) {
	    	 System.out.println(a2 + " is largest number");
	     }
	     else {
	    	 System.out.println(a3 + " is largest number");
	     }
	     
	     // Task - student -> had given exam -> ( grade -> A, B, C ) -> Prize -> ( Bike, Shoes, Book )
	     char stud_grade = 'A';
	     if(stud_grade == 'A') {
	        	System.out.println("Student will get bike");
	     }
	     else if(stud_grade == 'B') {
	        	System.out.println("Student will get sports shoes ");
	     }
	     else{
	        	System.out.println("Student will get book to read");
	     }
	     
	     
	     //nested if statement - check condition after one another
	     int a11 = 100;
	     int b12 = 200;
	   
	     if( a11 == 100 ) {
	        if( b12 == 200 ) {
	        	System.out.println("Both condition is true\n" );
	        }
	     }
	     
	     // Task - check number is grater than 20 and even number
	     int e = 30;
	        if(e > 20) {
	        	if(e%2 == 0) {
	        		System.out.println(e + " is number greater than 20 and even number");
	        	}
	        }
	        
	     //Nested-if ladder statement 
	        
	     // student - rollno - 101 , perform opearion bases on age 
	        int roll_no = 101;
	        int age = 23;
	        if(roll_no == 101) {
	        	if(age < 18) {
	        		System.out.println("Student is not allowed in bike riding");
	        	}
	        	else if(age >18) {
	        		System.out.println("Student is not allowed in bike riding");
	        	}
	        }
	        
	        //Task
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
		
	}

}
