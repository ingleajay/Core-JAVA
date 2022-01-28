package com.methods.task;

import java.util.Scanner;

public class Bank {
	
	public static void enterdetails(Scanner sc) {
		System.out.println("Enter your name");
		String user_name = sc.next();
		System.out.println("Enter your account no");
		long user_acc_no = sc.nextLong();
		System.out.println("Enter your branch");
		String branch=sc.next();
		System.out.println("Enter your city");
		String city=sc.next();
		System.out.println("Enter your phone");
		long phone_no=sc.nextLong();
		System.out.println("Enter your bank name");
		String bank_name=sc.next();
	}
	
	public static void userDetails(String user_name,long user_acc_no,String branch,String city,long phone_no,String bank_name) {
		System.out.println("User Name : " + user_name);
		System.out.println("User Account No : " + user_acc_no);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Branch : " + branch);
		System.out.println("City : " + city);
		System.out.println("Phone No : " + phone_no);
	}
	
	public static int deposite(int amount) {
		int res = 0;
		res  = res + amount; 
		return res;
	}
}


