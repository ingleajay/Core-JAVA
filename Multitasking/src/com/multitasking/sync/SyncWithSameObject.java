package com.multitasking.sync;

public class SyncWithSameObject {

	public static void main(String[] args) {
		
		// one object - c1
		// three threads - s1,s2,s3
		
		Cricketer c1 = new Cricketer();
	    SendMessage s1 = new SendMessage("Dhoni", c1);
	    SendMessage s2 = new SendMessage("Sachin", c1);
	    SendMessage s3 = new SendMessage("Youraj", c1);
	    s1.start();
		s2.start();
		s3.start();
	}
}
