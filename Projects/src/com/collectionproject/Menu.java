package com.collectionproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	  Scanner sc = new Scanner (System.in);
	  ArrayList<Book> issuebook = null;
	  ArrayList<Student> s = null;
	  ArrayList<Book> b = null;
	  
	  Menu(){
		  menu();
	  }
	  
	  public void menu () {
		    startScreen();	
	        while(true) {         
	            System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch(choice) {
				   case 1:
					   issuebook = LibServicesImpl.issuebook(b,s,sc);
					   System.out.println("List of issued book ");
					   for(Book e : b) {
						   System.out.println(e.getStudent());
					   }
					   break;
//				   case 2:
//					   Book[] returnbook = ServiceImpl.returnbook(issuebook,sc);
//					   System.out.println("List of returned book ");
//					   for(Book h : returnbook) {
//						   System.out.println("Book id : " + h.getBook_id() + " is return by " 
//					   +"Student id : " + h.getStudent().getStud_id());
//					   }
//					   break;
				   case 3: 
					   new LibServicesImpl().checkBook(b);
				   	   break;
				   case 4: 
					   new LibServicesImpl().checkStudent(s);
				   	   break;
				   case 5: 
					   b = LibServicesImpl.removeBook(b,sc);
					   System.out.println("Book is successfully removed please enter option 3 ");
				       break;
				   case 6: 
					   s = LibServicesImpl.removeStudent(s,sc);
					   System.out.println("Student is successfully removed please enter option 4 ");
				       break;
				   case 7: 
					   b = LibServicesImpl.updateBook(b,sc);
					   System.out.println("Book is successfully updated please enter option 3 ");
				       break;
				   case 8: 
					   s = LibServicesImpl.updateStudent(s,sc);
					   System.out.println("Student is successfully updated please enter option 4 ");
				       break;
	            }
	        }
	    }

	private void startScreen() {
		System.out.println("Welcome to Library management system (collection): ");
		// Add student data 
		System.out.println("Enter no of student to enter :");
		int no1 = sc.nextInt();
		s = LibServicesImpl.addStudent(sc,no1);
		// Add book data
		System.out.println("Enter no of book to enter :");
		int no2 = sc.nextInt();
	    b = LibServicesImpl.addBook(sc,no2);
		System.out.println("1.Issue book \n2.Return book \n3.Check Books \n4.Check Student "
 				+ "\n5.remove book \n6.remove student \n7.Update book \n8.Update Student \n9.Exit");
	}
}
