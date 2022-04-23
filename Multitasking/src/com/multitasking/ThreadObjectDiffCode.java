package com.multitasking;
class Thread3 extends Thread{

	int i;
	int j;

	public Thread3(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class ThreadObjectDiffCode {

	public static void main(String[] args) {
		
		Thread3 t1 = new Thread3(2,3) {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Addition : " + (i+j));
			}
			
		};
		t1.start();
		
		Thread3 t2 = new Thread3(1,2) {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

				System.out.println("Substraction : " + (i-j));
			}
		};
		t2.start();
	}
}
