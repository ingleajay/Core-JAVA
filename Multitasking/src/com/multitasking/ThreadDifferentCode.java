package com.multitasking;


class Thread1 implements Runnable{

	private int data;

	public Thread1(int data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()+ " for find factorial of number");
		int f = 1;
		for(int i=1;i<=data;i++) {
			f = f*i;
		}
		System.out.println("Factorial no - " + data + " is " + f);
	}
	
}

class Thread2 implements Runnable{

	private int i;
	private int j;

	public Thread2(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		int result = i*j;
		System.out.println("Multiplication : "+ result);
	}
}

public class ThreadDifferentCode{

	public static void main(String[] args) {
		
		    // Thread1 -> factorial number
		    // Thread2 -> muplication of number
		    System.out.println("Thread " + Thread.currentThread().getId()+ " is running");

            Thread object = new Thread(new Thread1(5));
            object.start();
            Thread object1 = new Thread(new Thread2(2,3));
            object1.start();
	}
}
