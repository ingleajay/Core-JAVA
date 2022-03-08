package com.programs;

// ATM - ( for user -> Withdrawcash , setting pin , balance checking...) 
 //      - ( for internal -> accesstoken, fetchbank, fetchuserdetail ...)

abstract class ATM{
	
	abstract void clientaccesstoken();
	abstract void fecthbankdetail();
	abstract void fecthuserdetail();
	
	public void withdraw(){
		System.out.println("cash withdrwal is processing.....");
		// write code
	}
	
	public void settingPin(){
		System.out.println("User setting his pin for debit card....");
		// write code
	}
	
	public void balancecheck() {
		System.out.println("User is checking his balanced...");
		// write code
	}
}

public class AbstractionTask extends ATM {

	public static void main(String[] args) {
		
		ATM a = new AbstractionTask();
		a.balancecheck();
		a.settingPin();
		a.withdraw();
		a.clientaccesstoken();
		a.fecthbankdetail();
		a.fecthuserdetail();
	}

	@Override
	void clientaccesstoken() {
		System.out.println("Successfully get token...");
		
	}

	@Override
	void fecthbankdetail() {
		//write code
		System.out.println("Successfully fectch bank details...");
	}

	@Override
	void fecthuserdetail() {
		// write code
		System.out.println("Successfully fetch user details...");
	}
}
