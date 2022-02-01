package com.methods.task;

import java.util.Scanner;

public class PerformTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("::Welcome to perform task opeartion: \n");
		System.out.println("Enter your number in one line ");
		String str = sc.nextLine();
		System.out.println("Data : " + str);
		while(true) {
			System.out.println("1.Sum of all Numbers \n2.Find Even & Odd \n3.Find Prime Numbers \n4.Exit\n");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : Services.sumofnumber(str);
			}
		}
	}

	
}
