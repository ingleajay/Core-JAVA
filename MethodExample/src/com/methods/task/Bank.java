package com.methods.task;

public class Bank {
	
	String user_name;
	long user_acc_no;
	String branch;
	String city;
	long phone_no;
	String bank_name;
	
	public static void userDetails(String user_name,long user_acc_no,String branch,String city,long phone_no,String bank_name) {
		System.out.println("User Name : " + user_name);
		System.out.println("User Account No : " + user_acc_no);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Branch : " + branch);
		System.out.println("City : " + city);
		System.out.println("Phone No : " + phone_no);
	}
}
