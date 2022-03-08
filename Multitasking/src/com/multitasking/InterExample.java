package com.multitasking;
class Postman extends Thread{
	int sum=0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Postman Thread starts calculations : " + Thread.currentThread().getName());
			for(int i=0;i<=100;i++) {
				sum = sum + i;
			}
			System.out.println("Postman thread trying to give notification");
			this.notify();
		}
	}
}

class Boy extends Thread{
	
	Postman p = new Postman();
	
	@Override
	public void run() {
		 p.start();
		
		//1.sleep method - not recommded- Postman has done his notification but Boy sleep for exta n millisec -> not get ans 
// System.out.println("Boy Thread Trying to call wait() method : " + Thread.currentThread().getName());
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Boy thread gets notification and value after Postman completes : " + p.sum);
		
		// 2. join method - not recommended - in postman code we have before and after lot of code then we need to do wait until this code finish 
//        System.out.println("Boy Thread Trying to call wait() method : " + Thread.currentThread().getName());
//		try {
//			p.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        System.out.println("Boy thread gets notification and value after Postman completes : " + p.sum);


		synchronized (p) { 
			System.out.println("Boy Thread Trying to call wait() method : " + Thread.currentThread().getName());
			try {
				p.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Boy thread gets notification and value after Postman completes : " + p.sum);
		}
	}
	
}

public class InterExample {

	public static void main(String[] args) {
		Boy b = new Boy();
		b.start();
	}
}
