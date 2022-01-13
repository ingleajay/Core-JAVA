package com.multitasking;

public class ThreadExample extends Thread{
	
	public void run(){  
		// to perform actions of thread 
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");	
	} 

	public static void main(String[] args) {
		
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	ThreadExample t = new ThreadExample();
    		t.start();
        }
	}
}
