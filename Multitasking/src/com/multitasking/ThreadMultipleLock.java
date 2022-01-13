package com.multitasking;

class X extends Thread{
	void msg1() {
		for(int i=0;i<2;i++) {
			System.out.println("This msg from X");
		}
	}
}
class Y extends Thread{
	void msg2() {
		for(int i=0;i<2;i++) {
			System.out.println("This msg from Y");
		}
	}
}
class Z extends Thread{
	void msg3() {
		for(int i=0;i<2;i++) {
			System.out.println("This msg from Z");
		}
	}
}

public class ThreadMultipleLock {
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Z z = new Z();
		x.start();
		y.start();
		z.start();
	    synchronized (x) {
			// Here I have lock of X object
			x.msg1();
			synchronized (y) {
				// Here I have lock of X and Y object
				y.msg2();
				synchronized (z) {
					// Here I have lock of X, Y , Z object
					z.msg3();
				}
			}
		}
	}
}
