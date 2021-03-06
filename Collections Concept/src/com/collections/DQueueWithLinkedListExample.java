package com.collections;
import java.util.Deque;
import java.util.LinkedList;

public class DQueueWithLinkedListExample {

	public static void main(String[] args) {
		
		 Deque<String> dq= new LinkedList<String>();
		 dq.offer("Jaya");
		 dq.offer("Ajay");
		 dq.offer("mano");
		 dq.offer("ahaha");
		 
		// duplicate allowed
	    dq.offer("ahaha");
	    System.out.println("Elements : " + dq);
	    
	    // add first and last to array
	    dq.addFirst("Satashil");
	    dq.addLast("kakaka");
	    System.out.println("Updated ele : " + dq);
	    
	    // retains all
	    Deque<String> al= new LinkedList<String>();
	     al.add("mano");  
	     al.add("Hanumat");  
	     dq.retainAll(al);
	     System.out.println("Retains : " + dq);
		 
	}

}
