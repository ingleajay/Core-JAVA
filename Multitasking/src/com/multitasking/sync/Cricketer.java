package com.multitasking.sync;

public class Cricketer {

		
	// if I make only sync to method and has same object for two thread -> non-simult output 
	// if I make only sync to method and has different object for two thread -> simult output
//	public synchronized void wishmsg(String msg) throws InterruptedException {
//		for(int i=0; i<4;i++) {
//			System.out.println("Message : " + msg);
//			Thread.sleep(2000);
//		}
//	}
	
	
	// if I make static sync to method for same object for two thread -> non-simult output
	// if I make static sync to method for different object for two thread -> non-simult output
//	public static synchronized void wishmsg(String msg) throws InterruptedException {
//		for(int i=0; i<4;i++) {
//			System.out.println("Message : " + msg);
//			Thread.sleep(2000);
//		}
//	}
	
	// if I make sync to block of code of method use this and has same object for two thread -> non-simut output
	// if I make sync to block of code of method use this and has different object for two thread ->simut output
//	public void wishmsg(String msg) throws InterruptedException {
//		synchronized (this) {
//			for(int i=0; i<4;i++) {
//				System.out.println("Message : " + msg);
//				Thread.sleep(2000);
//			}
//		}
//     }
	
	// if I make static sync to block of code of method and has same object for two thread -> non-simut output
	// if I make static sync to block of code of method and has different object for two thread -> non-simut output
//	public void wishmsg(String msg) throws InterruptedException {
//		synchronized (Cricketer.class) {
//			for(int i=0; i<4;i++) {
//				System.out.println("Message : " + msg);
//				Thread.sleep(2000);
//			}
//		}
//     }
	
	// if I make sync to block of code of method use obj of class and has same object for two thread -> non-simut output
    // if I make sync to block of code of method and obj of class has different object for two thread ->simut output
	public void wishmsg(String msg) throws InterruptedException {
	for(int i=0; i<4;i++) {
		System.out.println("Message : " + msg);
		Thread.sleep(2000);
	}
}
}
