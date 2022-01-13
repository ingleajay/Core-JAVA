package com.oops;

class Student1 {
	
	// why do we need this keyword 
    int stud_id; 
    Student1(int stud_id) {
         stud_id = stud_id;
    }
    
    // without this keyword
    
    float score;
    Student1(float stud_mark){
    	score = stud_mark;
    }
    
    // with this keyword
    
    String stud_name;
    Student1(String stud_name){
    	this.stud_name = stud_name;
    }
}


public class ThisKeyword {

	public static void main(String[] args) {
		
		Student1 s = new Student1(101);
		System.out.println("Student id : " + s.stud_id);
		
		Student1 s1 = new Student1(99.99f);
		System.out.println("Student Mark  : " + s1.score);
		
		Student1 s2 = new Student1("Ajay Ingle");
        System.out.println("Student Name  : " + s2.stud_name);
	}

}
