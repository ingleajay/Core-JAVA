package com.multitasking.sync;

public class SyncBlockClassObjectWithCommon {

	public static void main(String[] args) {
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
