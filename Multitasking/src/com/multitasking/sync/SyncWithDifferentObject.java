package com.multitasking.sync;

public class SyncWithDifferentObject {

	public static void main(String[] args) {
		
		// one object - c1,c2
		// three threads - s1,s2,s3
		// we have simul ans - object level lock here....
		// use static keyword - class level lock
		
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer();
	    SendMessage s1 = new SendMessage("Dhoni", c1);
	    SendMessage s2 = new SendMessage("Sachin", c1);
	    SendMessage s3 = new SendMessage("Youraj", c2);
	    s1.start();
		s2.start();
		s3.start();
	}
}
