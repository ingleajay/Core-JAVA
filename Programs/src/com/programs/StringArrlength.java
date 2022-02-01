package com.programs;

import java.util.Scanner;

public class StringArrlength {

	public static void main(String[] args) {
		// get no of student name as string and put into string array from user 
		//and calcaulate length of each

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of string ");
		int no = sc.nextInt();
		String[] str = new String[no];
		for(int i=0; i<str.length;i++) {
			System.out.println("Enter name of student");
			String st = sc.next();
			int res = findlength(st);
			System.out.println("Student " + st +  " at " + i + " is " + res);
		}
	}

	private static int findlength(String item) {
		return item.length();
	}
}
