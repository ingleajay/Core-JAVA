package com.arrayconcept;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("::Welcome to Student record platform:: \n");
		System.out.println("1.Get Highest \n2.Get Lowest \n3.Avg class marks \n4.Exit\n");
		Student.studentData();
		
		while(true) {
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
		     	case 1 : 
		     		    Student.gethighest();
		     			break;
		     	case 2 : Student.getlowest();
		     			break;
		     	case 3 : Student.getavgmarks();
		     			break;
		     	case 4 : System.exit(0);
		     			break;
		     	default:System.out.println("You have enter incorrect option");
			}
		}
		
	}

}
