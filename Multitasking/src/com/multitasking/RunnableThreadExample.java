package com.multitasking;

public class RunnableThreadExample implements Runnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread running");	

		Thread object = new Thread(new RunnableThreadExample());
        object.start();
		
	}

	@Override
	public void run() {
		int n = 8; 
        for (int i = 0; i < n; i++) {
            System.out.println("Hie");
        }
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
	}
}
