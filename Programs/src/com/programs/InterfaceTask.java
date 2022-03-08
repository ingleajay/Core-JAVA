package com.programs;

//ATM - ( for user -> Withdrawcash , setting pin , balance checking...) 
//      - ( for internal -> accesstoken, fetchbank, fetchuserdetail ...)

interface ATM1{
	
	void clientaccesstoken();
	void fecthbankdetail();
	void fecthuserdetail();
	
	default void withdraw(){
		System.out.println("cash withdrwal is processing.....");
		// write code
	}
	
	public static void settingPin(){
		System.out.println("User setting his pin for debit card....");
		// write code
	}
	
	default void balancecheck() {
		System.out.println("User is checking his balanced...");
		// write code
	}
	
}

public class InterfaceTask {

	public static void main(String[] args) {
		
		ATM1 a = new ATM1() {

			@Override
			public void clientaccesstoken() {
				System.out.println("Successfully get token...");
				
			}

			@Override
			public void fecthbankdetail() {
				//write code
				System.out.println("Successfully fectch bank details...");
			}

			@Override
			public void fecthuserdetail() {
				// write code
				System.out.println("Successfully fetch user details...");
			}
			
		};
		a.clientaccesstoken();
		a.fecthbankdetail();
		a.fecthuserdetail();
		a.balancecheck();
		a.withdraw();
		ATM1.settingPin();
	}
}
