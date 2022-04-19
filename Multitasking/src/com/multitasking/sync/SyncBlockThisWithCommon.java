package com.multitasking.sync;

public class SyncBlockThisWithCommon {

	public static void main(String[] args) {
		
		// three ways : 
		// 1. use this keyword => object lock
		// 2. use objects => obejct lock
		// 3. use classname.class => class level block
		
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer();
	    SendMessage s1 = new SendMessage("Dhoni", c1);
	    SendMessage s2 = new SendMessage("Sachin", c1);
	    SendMessage s3 = new SendMessage("Youraj", c1);
	    s1.start();
		s2.start();
		s3.start();

	}
}
