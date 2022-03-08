package com.arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	static int n = 3;
	static String[] studnames = new String[n];
	static Float[] studmarks = new Float[n];
	
	public static void studentData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Enter student data :------- ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter student name : ");
			String studname = sc.next();
			System.out.println("Enter student marks / 100 : ");
			Float studmark = sc.nextFloat();
			studnames[i] = studname;
			studmarks[i] = studmark;
		}
		for(int i=0; i<n;i++) {
				System.out.println("Student name : " + studnames[i] + " marks - " + studmarks[i] );
		}
	}
	
	public static void gethighest() {
		System.out.println("Get student name who has highest marks : " + (Arrays.toString(studmarks)));
		float max = studmarks[0];
		String name = "";
		for(int i=0;i<n;i++) {
			if(max<studmarks[i]) {
				max= studmarks[i];
				name = studnames[i];
			}
		}
		System.out.println("Student " + name  + " has highest mark -  " + max);
	}
	
	public static void getlowest() {
		System.out.println("Get student name who has lowest marks : " + (Arrays.toString(studmarks)));
		float min = studmarks[0];
		String name = "";
		for(int i=0;i<n;i++) {
			if(min>studmarks[i]) {
				min= studmarks[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(min==studmarks[i]) {
				name = studnames[i];
			}
		}
		System.out.println("Student " + name  + " has lowest mark -  " + min);
	}
	
	public static void getavgmarks() {
		System.out.println("Get Avg marks of class : ");
		float sum=0, avg= 0;
		for(int i=0;i<n;i++) {
			sum = sum + (studmarks[i]);
			avg = sum / n;
		}
		System.out.println("Class Avg mark is " + avg);
	}
}
