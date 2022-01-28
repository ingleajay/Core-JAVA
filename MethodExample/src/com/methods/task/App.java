package com.methods.task;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Bank App : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		
		while(choice >=1 && choice<=5) {
			System.out.println("1.Enter User details \n2.Deposite money \n3.Withdraw money \n4.Check Balance \n5.Exit");
			switch(choice) {
//				 case 1 : Bank.userDetails(user_name, user_acc_no, branch, city, phone_no, bank_name);
//				 		  break;
				 case 2 : System.out.println("Deposite your money ");
				          int amount = sc.nextInt();
				          int result =  Bank.deposite(amount);
				          System.out.println("Deposite successfully..");
				          break;
				 case 3 : System.out.println("Withdraw your money");
				          int amt = sc.nextInt();
		                  int res =  Bank.deposite(amt);
		                  System.out.println("Withdraw successfully..");
		                  break;
				 case 4 : System.out.println("Enter details of user ");
				 		  Bank.enterdetails(sc);
				 case 5 : System.exit(0);
				 		  break;
				 default:System.out.println("Incorrect details");
			}
		}
	}
}
