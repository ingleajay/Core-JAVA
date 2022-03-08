package com.programs;

import java.util.Scanner;

class Student{
	
	public static void msg(int stud_id , String msg_data, String msg_type1) {
		System.out.println("Message is sending to student " + stud_id + " of type " + msg_type1
				+ " it contains msg :  " + msg_data );
	}
	
	public static void msg(int stud_id , String msg_data, String msg_type1 , String msg_type2) {
		System.out.println("Message is sending to student " + stud_id + " of type " + msg_type1 + " , " + msg_type2 + " " 
				+ "it contains msg : " + msg_data );
	}
	
	public static void msg(int stud_id , String msg_data, String msg_type1, String msg_type2, String msg_type3) {
		System.out.println("Message is sending to student " + stud_id + " of type " + msg_type1 + " , " + msg_type2 + " , "
				+ msg_type3 + " " 
				+ "it contains msg : " + msg_data );
	}
}

public class overlodingTask {
	
	// student ( id - 1 to 3 ) , msg ( stud1 -> audio file, stud2 -> text file, doc file .....)

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.student one 2. student two 3. student three");

		while(true) {
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 : Student.msg(0, "I am happy now", "success");
			break;
			case 2 : Student.msg(1, "I am sad and happy also but confuse", "success" ,"sad");
			break;
			case 3: Student.msg(2, "You are in danger , please go out", "information", "warning", "sad");
			break;
			default:
				break;
			}
		}
		
	}
}
