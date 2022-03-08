package oops.project;

import java.util.Scanner;

public class ServiceImpl implements Services {

	public static Student[] addStudent(Scanner sc, int no) {
		Student[] student = new Student[no]; 
		System.out.println("Enter Student Details : ");
		for(int i=0; i<no;i++) {
			System.out.println("Student No : " + (i+1));
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter student Roll No");
			int id= sc.nextInt();
			System.out.println("Enter student division");
			char division = sc.next().charAt(0);
			student[i] = new Student(id,name,division);
			
		}
		return student;
	}
	
	public static Book[] addBook(Scanner sc ,int no) {
		Book[] book = new Book[no]; 
		System.out.println("Enter Book Details : ");
		for(int i=0; i<no;i++) {
			System.out.println("Book No : " + (i+1));
			System.out.println("Enter book id");
			int id= sc.nextInt();
			System.out.println("Enter Book name");
			String name = sc.next();
			String status = "add";
			book[i] = new Book(id,name,status);
		}
		return book;
	}
	
	public void checkStudent(Student[] s) {
		for(Student item : s) {
			System.out.println("This is data of student id  : " + item.getStud_id());
			System.out.println("Student Name : " + item.getStud_name());
			System.out.println("Student Division : " + item.getStud_division());
			System.out.println(" ");
		}
	}
	
	public void checkBook(Book[] b) {
		for(Book item : b) {
			System.out.println("This is data of book id  : " + item.getBook_id());
			System.out.println("Book Name : " + item.getBook_name());
			System.out.println("Book Status : " + item.getBook_status());
			System.out.println(" ");
		}
	}

	public static Book[] removeBook(Book[] b, Scanner sc) {
		Book[] copy = new Book[b.length - 1];
		System.out.println("Enter Book Id : ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<b.length;i++) {
			if(b[i].getBook_id() == id) {
				index = i;
			}
		}
		for (int i = 0, j = 0; i <b.length; i++) {
		    if (i != index) {
		        copy[j++] = b[i];
		    }
		}
		return copy;
	}

	public static Student[] removeStudent(Student[] s, Scanner sc) {
		Student[] copy = new Student[s.length - 1];
		System.out.println("Enter Student Id : ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<s.length;i++) {
			if(s[i].getStud_id() == id) {
				index = i;
			}
		}
		for (int i = 0, j = 0; i <s.length; i++) {
		    if (i != index) {
		        copy[j++] = s[i];
		    }
		}
		return copy;
		
	}

	public static Book[] updateBook(Book[] b, Scanner sc) {
		System.out.println("Enter Book Id : ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<b.length;i++) {
			if(b[i].getBook_id() == id) {
				index = i;
			}
		}
		for(int i=0; i<b.length;i++) {
			if(index == i) {
				System.out.println("Book Id : ");
				int bid = sc.nextInt();
				b[i].setBook_id(bid);
				System.out.println("Book Name : ");
				String name = sc.next();
				b[i].setBook_name(name);
				if(b[i].getBook_status()=="issue") {
					b[i].setBook_status("issue");
				}
				else {
					b[i].setBook_status("update");
				}
			}
		}
		return b;
	}
	
	public static Student[] updateStudent(Student[] s, Scanner sc) {
		System.out.println("Enter Student Id : ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<s.length;i++) {
			if(s[i].getStud_id() == id) {
				index = i;
			}
		}
		for(int i=0; i<s.length;i++) {
			if(index == i) {
				System.out.println("Studnet Id : ");
				int sid = sc.nextInt();
				s[i].setStud_id(sid);
				System.out.println("Student Name : ");
				String name = sc.next();
				s[i].setStud_name(name);
				System.out.println("Student Division : ");
				char div = sc.next().charAt(0);
				s[i].setStud_division(div);
			}
		}
		return s;
	}

	public static Book[] issuebook(Book[] b, Student[] s , Scanner sc) {
		Book[] issuebook = new Book[b.length];
		System.out.println("Enter book id ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<b.length;i++) {
			if(b[i].getBook_id() == id) {
				index = i;
			}
		}
		System.out.println("Enter student id  :");
		int sid = sc.nextInt();
		Student stud = null;
		for(Student sl : s) {
			if(sid == sl.getStud_id()) {
				stud = sl;
			}
		}
		for(int i=0; i<b.length;i++) {
			
			if(index == i) {
				b[i].setBook_status("issue");
				  b[i].setStudent(stud);
				issuebook[i] = new Book(b[i].getBook_id(),b[i].getBook_name(),b[i].getBook_status(),b[i].getStudent());
			}
			else {
			issuebook[i] = new Book(b[i].getBook_id(),b[i].getBook_name(),b[i].getBook_status(),b[i].getStudent());
			}

		}
		return issuebook;
	}

    public static Book[] returnbook(Book[] b, Scanner sc) {
		Book[] returnbook = new Book[b.length];
		System.out.println("Enter book id ");
		int id = sc.nextInt();
		int index = 0;
		for(int i=0; i<b.length;i++) {
			if(b[i].getBook_id() == id) {
				index = i;
			}
		}
		for(int i=0; i<b.length;i++) {
			if(index == i) {
				if(b[i].getBook_status() == "issue") {
					b[i].setBook_status("return");
					returnbook[i] = new Book(b[i].getBook_id(),b[i].getBook_name(),b[i].getBook_status(),b[i].getStudent());
				}
				else if(b[i].getBook_status() == "add" || b[i].getBook_status() == "update"){
					returnbook[i] = new Book(b[i].getBook_id(),b[i].getBook_name(),b[i].getBook_status(),b[i].getStudent());
				}
			}
			else {
				returnbook[i] = new Book(b[i].getBook_id(),b[i].getBook_name(),b[i].getBook_status(),b[i].getStudent());
			}
			
		}
		return returnbook;
	}
	
}
