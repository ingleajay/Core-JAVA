package com.multitasking.sync;


public class SendMessage extends Thread{

	Cricketer c;
	String name;
	SendMessage(String name, Cricketer c) {
		this.c = c;
		this.name = name;
	}
//	@Override
//	public void run() {
//		
//		try {
//			c.wishmsg(name);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public void run() {
		synchronized (c) {
			try {
				c.wishmsg(name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
