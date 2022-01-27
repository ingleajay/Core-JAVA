package com.methods.task;

public class OpenAccount {

	String type = "open_account";
	
	public static void saveAccount(String type) {
		Bank.userDetails(type, 0, type, type, 0, type);
	}
}
