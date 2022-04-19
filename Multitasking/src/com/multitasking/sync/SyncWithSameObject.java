package com.multitasking.sync;

public class SyncWithSameObject {

	public static void main(String[] args) {
		
		// one object - c1
		// three threads - s1,s2,s3
		
		// 1. It is only for method and block but not for class and variable
		// 2. better option where we want to allow only one thread to access the shared resource.
		// 3. Disadv - it increases waiting time-of the Thread and effects performance of the system.
		// 4. Internally synchronization concept is implemented by using lock concept.
		// 5. Thread wants to do opeartions on object. -> Thread will get lock and enter into section - relase lock when completed
		
		
		Cricketer c1 = new Cricketer();
	    SendMessage s1 = new SendMessage("Dhoni", c1);
	    SendMessage s2 = new SendMessage("Sachin", c1);
	    SendMessage s3 = new SendMessage("Youraj", c1);
	    s1.start();
		s2.start();
		s3.start();
	}
}
