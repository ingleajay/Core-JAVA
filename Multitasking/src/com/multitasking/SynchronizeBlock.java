package com.multitasking;

// Multiple detective hired by poilce to receive code from them and each one of will send one by one 

class Detective extends Thread{
	private String dname;
	private Police p;
	private String msg;
	public Detective(String msg , Police p , String dname) {
		this.p = p;
		this.msg = msg;
		this.dname = dname;
	}
	 public void run()   
	 { 
		 // To get lock of particular object of thread
		synchronized(p)   
		 {   
			for(int i=0;i<2;i++) {
		      p.sendmsg(msg, dname); 
			}  
		 }   
		
		// To get of current object of thread - > synchronized(this){}
		// To get class level of thread -> synchronized(Display.class)
	 }
}

class Police {
	private String msg;
	private String pname;
	
	Police(String pname){
		this.pname = pname;
	}
	
	void sendmsg(String msg , String dname) {
		System.out.println("Send Message from " + dname + " : " + msg + " to " + pname);
	}
	
}

public class SynchronizeBlock {

	public static void main(String[] args) throws InterruptedException {
		Police p = new Police("Ajay");
		Detective d1 = new Detective("1001",p , "DT1");
		Detective d2 = new Detective("1002", p, "DT2");
		d1.start();
		d2.start();
	}
}


