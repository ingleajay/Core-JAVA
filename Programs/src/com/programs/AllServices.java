package com.programs;

import java.util.Scanner;

public class AllServices {
	
	public static Subject[] addsubject(Subject[] sub, Scanner sc) {
		for(int i=0;i<sub.length;i++) {
			System.out.println("Enter details of subject " + (i+1));
			System.out.println("Enter subject name :");
			String subject_name = sc.next();
			System.out.println("Enter subject exam Pattern : ( MSQ, MCQ)");
			String pattern = sc.next();
			System.out.println("Enter no of questions for all subject common in exam:");
			int questions = sc.nextInt();
			sub[i] = new Subject(pattern,questions,subject_name); 
		}
		return sub;
	}

	
}
