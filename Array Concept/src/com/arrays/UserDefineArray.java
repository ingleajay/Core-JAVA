package com.arrays;

import java.util.Scanner;

class Student{
	
	int studid;
	String studname;
	
	public Student(int id, String name) {
		System.out.println("Student id : " + id + " name is : " + name);
	}
}

public class UserDefineArray {

	public static void main(String[] args) {
		
		System.out.println("Enter no of student : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Student[] s = new Student[no];
		for(int i=0; i<no;i++) {
			System.out.println("Enter stud id : ");
			int id = sc.nextInt();
			System.out.println("Enter stud Name : ");
			String name = sc.next();
			s[i] = new Student(id,name); 
		}
	}
}
