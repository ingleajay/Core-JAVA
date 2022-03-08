package com.multitasking;

class RunMethod extends Thread{
	// perform action for thread
	 public void run(){  
		  for(int i=1;i<5;i++){   
		    System.out.println(i);  
		  }  
	}
}

class SleepMethod extends Thread{
	// current executing thread sleep for n millsec time
	public void run(){  
		for(int i=1;i<5;i++){  
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    System.out.println(i);  
		}
	}
}

class JoinMethod extends Thread{
	// Thread class that permits one thread to wait until the other thread to finish its execution.
	public void run()  {  
		for (int j = 0; j < 2; j++)  { 
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
		}
	}	
}

class PriorityMethod extends Thread{
	// higher priority means get first chance to executed yes but not ever time 
	public void run()  {  
        System.out.println("The current thread name is: "+ Thread.currentThread().getName() + "Priority: " + Thread.currentThread().getPriority() ); 
		for(int i=1;i<4;i++){   
		    System.out.println(i);  
		} 
	}
}

class ThreadNameMethod extends Thread{
	ThreadNameMethod(String threadName)  
	{    
	   super(threadName);
	    
	} 
	public void run(){  
		  System.out.println("Thread - " + Thread.currentThread().getId() + " : " + Thread.currentThread().getName());
		  //System.out.println(Thread.currentThread().getState());
	}
}

class ThreadIsAliveMethod extends Thread{
	// This method returns true if the thread is still running and not finished.

	public void run() {
	    System.out.println("is run() method isAlive: " + Thread.currentThread().isAlive());
	}
}

class ThreadYieldMethod extends Thread{
	// The yield() method of thread class causes the currently executing 
	// thread object to temporarily pause and allow other threads to execute.
	
	// The thread which executes the yield method will enter in the Runnable state from Running state.
	// Once a thread pauses its execution, we can’t specify 
	// when it will get chance again it depends on thread scheduler.
	
	public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " control by run");  
    }  
}

class DaemonThread extends Thread{
	
	 public void run(){  
		  if(Thread.currentThread().isDaemon())
		   System.out.println("daemon thread work");  
		  else
		  System.out.println("user thread work");  
	 } 
}

public class ThreadMethodsExample {

	public static void main(String[] args) throws InterruptedException {
		
//		RunMethod r1=new RunMethod();  
//		RunMethod r2=new RunMethod();  
//		r1.start();
//		r2.start();
		// t1.run() and t2.run() => if we use this then thread object consider to be normal object call.
		
		 //1000ms  = 1sec
//		SleepMethod s1=new SleepMethod();  
//		SleepMethod s2=new SleepMethod();  
//		s1.start();
//		s2.start();
		
//		JoinMethod j1 = new JoinMethod();  
//		JoinMethod j2 = new JoinMethod();  
//		JoinMethod j3 = new JoinMethod(); 
//		j1.start();
//		
//		j1.join();
//		j2.start();
//		j2.join();
//		j3.start();
		
//		PriorityMethod p1 = new PriorityMethod();  
//		PriorityMethod p2 = new PriorityMethod();  
//		PriorityMethod p3 = new PriorityMethod(); 
//		// the priorities of the thread is 5, the default value  
//		System.out.println("Priority of the thread p1 is : " + p1.getPriority());  
//		System.out.println("Priority of the thread p2 is : " + p2.getPriority());  
//		System.out.println("Priority of the thread p3 is : " + p3.getPriority());  
//		p1.setPriority(7);  
//		p2.setPriority(6);  
//		p3.setPriority(9); 
//		System.out.println("Priority of the thread p1 is : " + p1.getPriority());  
//		System.out.println("Priority of the thread p2 is : " + p2.getPriority());  
//		System.out.println("Priority of the thread p3 is : " + p3.getPriority()); 
//		p1.start();
//		p3.start();
//		p2.start();
		
		
//		ThreadNameMethod t1 = new ThreadNameMethod("Ajay");  
//		ThreadNameMethod t2 = new ThreadNameMethod("Vijay"); 
//		t1.start();
//		t2.start();
		
//		ThreadIsAliveMethod is = new ThreadIsAliveMethod();
//        System.out.println("before starting thread isAlive: "+is.isAlive());  
//		is.start();
//        System.out.println("After starting thread isAlive: "+is.isAlive());  
//		
//		ThreadYieldMethod ty1 = new ThreadYieldMethod();
//		ThreadYieldMethod ty2 = new ThreadYieldMethod();
//		ThreadYieldMethod ty3 = new ThreadYieldMethod();
//		ty1.yield();
//		ty2.start();
//		ty2.join();
//		ty3.start();
		
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();
		
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();
		dt3.start();

	 	
	}
}
