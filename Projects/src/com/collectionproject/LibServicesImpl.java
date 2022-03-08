package com.collectionproject;

import java.util.ArrayList;
import java.util.Scanner;

public class LibServicesImpl implements libService{

	@Override
	public void checkStudent(ArrayList<Student> s) {
		for(Student item : s) {
			System.out.println("This is data of student id  : " + item.getStud_id());
			System.out.println("Student Name : " + item.getStud_name());
			System.out.println("Student Division : " + item.getStud_division());
			System.out.println(" ");
		}
	}

	@Override
	public void checkBook(ArrayList<Book> b) {
		for(Book item : b) {
			System.out.println("This is data of book id  : " + item.getBook_id());
			System.out.println("Book Name : " + item.getBook_name());
			System.out.println("Book Status : " + item.getBook_status());
			System.out.println(" ");
		}
	}

	public static ArrayList<Student> addStudent(Scanner sc, int no) {
		ArrayList<Student> s = new ArrayList<Student>();
		System.out.println("Enter Student Details : ");
		for(int i=0; i<no;i++) {
			System.out.println("Student No : " + (i+1));
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter student Roll No");
			int id= sc.nextInt();
			System.out.println("Enter student division");
			char division = sc.next().charAt(0);
			s.add(new Student(id,name,division));
		}
		return s;
	}

	public static  ArrayList<Book> addBook(Scanner sc, int no2) {
		ArrayList<Book> b = new ArrayList<Book>();
		System.out.println("Enter Book Details : ");
		for(int i=0; i<no2;i++) {
			System.out.println("Book No : " + (i+1));
			System.out.println("Enter book id");
			int id= sc.nextInt();
			System.out.println("Enter Book name");
			String name = sc.next();
			b.add(new Book(id,name));
		}
		return b;
	}
	
	public static ArrayList<Student> updateStudent(ArrayList<Student> s, Scanner sc) {
		System.out.println("Enter Student Id : ");
		int id = sc.nextInt();
		for(int i=0;i<s.size();i++) {
			if(id == s.get(i).getStud_id()) {
				System.out.println("Studnet Id : ");
				int sid = sc.nextInt();
				s.get(i).setStud_id(sid);
				System.out.println("Student Name : ");
				String name = sc.next();
				s.get(i).setStud_name(name);
				System.out.println("Student Division : ");
				char div = sc.next().charAt(0);
				s.get(i).setStud_division(div);
			}
		}
		return s;
	}
	
	public static ArrayList<Book> updateBook(ArrayList<Book> b, Scanner sc) {
		System.out.println("Enter Book Id : ");
		int id = sc.nextInt();
		for(int i=0;i<b.size();i++) {
			if(id == b.get(i).getBook_id()) {
				System.out.println("Book Id : ");
				int bid = sc.nextInt();
				b.get(i).setBook_id(bid);
				System.out.println("Book Name : ");
				String name = sc.next();
				b.get(i).setBook_name(name);
			}
		}
		return b;
	}

	public static ArrayList<Student> removeStudent(ArrayList<Student> s, Scanner sc) {
		System.out.println("Enter Student Id : ");
		int id = sc.nextInt();
		for(int i=0;i<s.size();i++) {
			if(id == s.get(i).getStud_id()) {
				s.remove(i);
			}
		}
		return s;
	}
	
	public static ArrayList<Book> removeBook(ArrayList<Book> b, Scanner sc) {
		System.out.println("Enter Book Id : ");
		int id = sc.nextInt();
		for(int i=0;i<b.size();i++) {
			if(id == b.get(i).getBook_id()) {
				b.remove(i);
			}
		}
		return b;
	}

	public static ArrayList<Book> issuebook(ArrayList<Book> b,ArrayList<Student> s, Scanner sc) {
		System.out.println("Enter book id ");
		int id = sc.nextInt();
		for(int i=0;i<b.size();i++) {
			if(id==b.get(i).getBook_id()) {
				System.out.println("Enter student id  :");
				int sid = sc.nextInt();
				ArrayList<Student> stud = b.get(i).getStudent().put(b, s);
//				if(stud.get(i)) {
//				   b.get(i).setBook_status("issue");		
//				}
			}
		}
		return b;
	}
}
