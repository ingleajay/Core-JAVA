package oops.project;
import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Library management system : ");
		Scanner sc = new Scanner(System.in);
		// Add student data 
		System.out.println("Enter no of student to enter :");
		int no1 = sc.nextInt();
		Student[] s = ServiceImpl.addStudent(sc,no1);
		// Add book data
		System.out.println("Enter no of book to enter :");
		int no2 = sc.nextInt();
		Book[] b = ServiceImpl.addBook(sc,no2);
 		System.out.println("1.Issue book \n2.Return book \n3.Check Books \n4.Check Student "
 				+ "\n5.remove book \n6.remove student \n7.Update book \n8.Update Student \n9.Exit");
 		Book[] issuebook = null;
		while(true) {
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			   case 1:
				   issuebook = ServiceImpl.issuebook(b,s,sc);
				   System.out.println("List of issued book ");
//				   for(Book h : issuebook) {
//					   if(h.getBook_status() != "return" && h.getStudent() != null) {
//					   System.out.println("Book id : " + h.getBook_id() + " is issued by " 
//				   +"Student id : " + h.getStudent().getStud_id());
//					   }
//				   }
				   System.out.println(Arrays.toString(issuebook));
				   break;
			   case 2:
				   Book[] returnbook = ServiceImpl.returnbook(issuebook,sc);
				   System.out.println("List of returned book ");
//				   for(Book h : returnbook) {
//					   if(h.getBook_status() != "issue" && h.getStudent() != null) {
//					   System.out.println("Book id : " + h.getBook_id() + " is return by " 
//				   +"Student id : " + h.getStudent().getStud_id());
//					   }
//				   }
				   System.out.println(Arrays.toString(returnbook));
				   break;
			   case 3: 
				   new ServiceImpl().checkBook(b);
			   	   break;
			   case 4: 
				   new ServiceImpl().checkStudent(s);
			   	   break;
			   case 5: 
				   b = ServiceImpl.removeBook(b,sc);
				   System.out.println("Book is successfully removed please enter option 3 ");
			       break;
			   case 6: 
				   s = ServiceImpl.removeStudent(s,sc);
				   System.out.println("Student is successfully removed please enter option 4 ");
			       break;
			   case 7: 
				   b = ServiceImpl.updateBook(b,sc);
				   System.out.println("Book is successfully updated please enter option 3 ");
			       break;
			   case 8: 
				   s = ServiceImpl.updateStudent(s,sc);
				   System.out.println("Student is successfully updated please enter option 4 ");
			       break;
			}
		}
	}
}
