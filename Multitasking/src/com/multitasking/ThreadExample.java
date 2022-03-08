package com.multitasking;

public class ThreadExample extends Thread{
	
	public void run(){  
		// to perform actions of thread 
		int n = 8; 
        for (int i = 0; i < n; i++) {
        	System.out.println("Ajay Ingle");
        }
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");	
	} 

	public static void main(String[] args) {
        	
    		System.out.println(Thread.currentThread().getName() + " thread running");	
    		ThreadExample t = new ThreadExample();
    		t.start();
	}
}
