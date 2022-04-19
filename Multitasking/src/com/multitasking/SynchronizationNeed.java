package com.multitasking;

class Cricketer1{
	
	// if method is not sync then it will executed simultonulsy.
	// sync required -> object level required
	
	
	// if we have two objects different and accesing different cricker name 
	// then no point of use sync
	
	// static syn required -> class level locker
	// sync required -> object level locker
	
	// if I make only sync to method and has same object for two thread -> non-simult output 
	// if I make only sync to method and has different object for two thread -> simult output
	// if I make static sync to method for same object for two thread -> non-simult output
	// if I make static sync to method for different object for two thread -> non-simult output
	// if I make sync to block of code of method and has same object for two thread -> non-simut output
	// if I make sync with this argument to block of code of method and has different object for two thread -> simult output
	// if I make sync with className.class as argument to block of code of method and has different object for two thread -> non-simult output
	
	
	public synchronized void wishmsg(String msg) throws InterruptedException { // static // synchorization
//		
		synchronized (this) {
			for(int i=0; i<4;i++) {
				System.out.println("Message : " + msg);
				Thread.sleep(2000);
			}
		}
		
//		synchronized (Cricketer.class) {
//			for(int i=0; i<4;i++) {
//				System.out.println("Message : " + msg);
//				Thread.sleep(2000);
//			}
//		}
//		for(int i=0; i<4;i++) {
//		System.out.println("Message : " + msg);
//		Thread.sleep(2000);
//		}
		
	}
}

class SendWishMessage extends Thread{
	Cricketer1 c;
	String name;
	SendWishMessage(String name, Cricketer1 c) {
		this.c = c;
		this.name = name;
	}
	@Override
	public void run() {
		try {
			c.wishmsg(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class SynchronizationNeed {
	
	// 1. It is only for method and block but not for class and variable
	// 2. better option where we want to allow only one thread to access the shared resource.
	// 3. Disadv - it increases waiting time-of the Thread and effects performance of the system.
	// 4. Internally synchronization concept is implemented by using lock concept.
	// 5. Thread wants to do opeartions on object. -> Thread will get lock and enter into section - relase lock when completed
	

	public static void main(String[] args) {
	    Cricketer1 c1 = new Cricketer1();
	    Cricketer1 c2 = new Cricketer1();
	    SendWishMessage s1 = new SendWishMessage("Dhoni", c1);
	    SendWishMessage s3 = new SendWishMessage("Sachin", c1);
        SendWishMessage s2 = new SendWishMessage("Youraj", c1);
		s1.start();
		s3.start();
		s2.start();
	}
}
