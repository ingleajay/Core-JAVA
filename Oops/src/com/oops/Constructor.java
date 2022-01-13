package com.oops;

class Student{
	int stud_id = 101;
    int id;
    
    Student(){
    	System.out.println("Student default constructor is running");
    }
    
    Student(int stud_id) {
         id = stud_id;
    }	
    
// oR
    
//    Student1(int stud_id) {
//        this.stud_id = stud_id;
//   }
    
    
}

public class Constructor {
	
	int constructor_id;

	public static void main(String[] args) {
		
		// Why do we need a constructor?
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
		
        System.out.println("Constructor 1 id : " + c1.constructor_id);
        System.out.println("Constructor 1 id : " + c2.constructor_id);
        
        
        // Default constructor
        Student s = new Student();
        
        // Parameterized constructor
        Student sp = new Student(101);
        System.out.println("Student id : " + sp.id);
	}

}
