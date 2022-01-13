package com.multitasking;

public class RunnableThreadExample implements Runnable {

	public static void main(String[] args) {
		
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new RunnableThreadExample());
            object.start();
        }
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
	}

}
