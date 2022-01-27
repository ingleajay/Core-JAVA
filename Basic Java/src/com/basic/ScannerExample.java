package com.basic;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter Students data : ");
		int stud_roll= sc.nextInt();
		String stud_name = sc.next();
		Float stud_marks = sc.nextFloat();
		
		System.out.println("Student roll no : " + stud_roll);
		System.out.println("Student name : " + stud_name);
		System.out.println("Student marks : " + stud_marks); */
		
		// Example : 
		// Task 1 : Add two Number
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Addition is : " + (n1+n2));
		
	}
}
