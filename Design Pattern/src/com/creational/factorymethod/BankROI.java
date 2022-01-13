package com.creational.factorymethod;

import java.util.Scanner;

public class BankROI {

	public static void main(String[] args) {
		GetBankObject b = new GetBankObject();
		System.out.println("Enter your bank name (SBI/Axis)");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	    Bank bank = b.getBankInstance(str);
	    bank.getROI();
	}
}
