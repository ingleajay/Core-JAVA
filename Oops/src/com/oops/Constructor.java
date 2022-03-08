package com.oops;

class Student{
	int stud_id = 101;
    int id;
    
    Student(){
    	System.out.println("Student default constructor is running ");
    	id = stud_id;
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
		
		// Constructor is a way to initialize objects not to create an object.
		// Rules : 
		// 1. Constructor name must be the same as its class name
		// 2. A Constructor must have no explicit return type
		// 3. A Java constructor cannot be abstract, static, final, and synchronized
		
		// Why do we need a constructor? - student id -0,1,2,...
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
		
        System.out.println("Constructor 1 id : " + c1.constructor_id);
        System.out.println("Constructor 1 id : " + c2.constructor_id);
        
        
        // Default constructor
        Student s = new Student();
        System.out.println("Student Constructor default : " + s.id);
        
        // Parameterized constructor
        Student sp = new Student(101);
        System.out.println("Student id : " + sp.id);
	}

}
