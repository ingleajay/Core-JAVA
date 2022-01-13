package com.multitasking;

class Cricketer{
	
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
	
	
	public void wishmsg(String msg) throws InterruptedException { // static // synchorization
		
//		synchronized (this) {
//			for(int i=0; i<4;i++) {
//				System.out.println("Message : " + msg);
//				Thread.sleep(2000);
//			}
//		}
		
		synchronized (Cricketer.class) {
			for(int i=0; i<4;i++) {
				System.out.println("Message : " + msg);
				Thread.sleep(2000);
			}
		}
//		for(int i=0; i<4;i++) {
//		System.out.println("Message : " + msg);
//		Thread.sleep(2000);
//		}
		
	}
}

class SendWishMessage extends Thread{
	Cricketer c;
	String name;
	SendWishMessage(String name, Cricketer c) {
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

	public static void main(String[] args) {
	    Cricketer c1 = new Cricketer();
	    Cricketer c2 = new Cricketer();
	    SendWishMessage s1 = new SendWishMessage("Dhoni", c1);
	    // SendWishMessage s3 = new SendWishMessage("Sachin", c1);
        SendWishMessage s2 = new SendWishMessage("Youraj", c2);
		s1.start();
		//s3.start();
		s2.start();
	}
}
