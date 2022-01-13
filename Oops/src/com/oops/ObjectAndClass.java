package com.oops;

public class ObjectAndClass {

	int stud_id = 101;
	static int  marks = 200;
	public static void main(String[] args) {

		//  Access Student id
		ObjectAndClass s = new ObjectAndClass();
        System.out.println("Student id : " + s.stud_id);
        
        // Access student marks
        System.out.println("Student Marks : " + marks);
	}
}
