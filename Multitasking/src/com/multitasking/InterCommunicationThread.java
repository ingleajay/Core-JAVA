package com.multitasking;

class ThreadB extends Thread{
	int sum = 0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread starts calculations : " + Thread.currentThread().getName());
			for(int i=0;i<=100;i++) {
				sum = sum + i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
}

public class InterCommunicationThread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b = new ThreadB();
		b.start();
		Thread.sleep(1); // if we write here then it will go in dead state... because main thread get sleep here so child get chance
        
		 System.out.println("Current Thread: " + Thread.currentThread().getName() + " Sum : " + b.sum);  
//		 it gives main thread gets chance => 0, 
//		 Child ThreadB gets chance => 5050 
//		 if both gets chance one by one then => 0<=x<=50555 value
		
		// Thread.sleep(1); // main method sleep here
		// System.out.println("Current Thread: " + Thread.currentThread().getName() + " Sum : " + b.sum);
		// It is not recommended method =>because if ThreadB gets completed early then it needs to wait for extra millisecond
		// or it can get more time then it will print middle value 
		
		// b.join(); 
		// System.out.println("Current Thread: " + Thread.currentThread().getName() + " Sum : " + b.sum);
		// It is not recommended method
		// Thread B needs to print value when it completed for loop 
		// but if lets say we have more number of code after for loop then also main method wait to print till ThreadB completes
		
//		synchronized (b) { // main thread gets locks and enter inside
//			System.out.println("Main Thread Trying to call wait() method : " + Thread.currentThread().getName());
//			b.wait();
//			System.out.println("Main thread gets notification and value after thread B completes : " + b.sum);
//		}
		
		
	}
}
