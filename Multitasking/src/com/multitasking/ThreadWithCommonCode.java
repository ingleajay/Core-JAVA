package com.multitasking;

class TestThread extends Thread{

	private int i;
	private int j;

	public TestThread(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public void run() {
		System.out.println("Addition : " + (i+j));
	}
	
	
}

public class ThreadWithCommonCode {

	public static void main(String[] args) {
		
		TestThread t1 = new TestThread(2,3);
		t1.start();
		
		TestThread t2 = new TestThread(1,2);
		t2.start();

	}
}
