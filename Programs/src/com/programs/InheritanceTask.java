package com.programs;

import java.util.Scanner;

// Exam - (Subject - DSA, JAVA, CN, ....) -> Data of exam ( subject name, pattern, questions ) 

class Exam{
	String pattern; // mcq or msq
	int questions;
	String subject_name;

	public Exam(String pattern, int questions, String subject_name) {
		super();
		this.pattern = pattern;
		this.questions = questions;
		this.subject_name = subject_name;
	}

}

class Subject extends Exam{

	public Subject(String pattern, int questions, String subject_name) {
		super(pattern, questions, subject_name);
	}
}



public class InheritanceTask {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of subject");
		int no = sc.nextInt();
		
		Subject[] sub = new Subject[no];
		// Add subject data one by one
		Subject[] s = AllServices.addsubject(sub , sc);
		for(Subject ele : s) {
			System.out.println("Exam details of " + ele.subject_name + " subject");
			System.out.println("Pattern format : " + ele.pattern);
			System.out.println("No of questions in exam : " + ele.questions);
		}

	}
}
