package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueueWithArrayExample {

	public static void main(String[] args) {
		
		 Deque<String> dq= new ArrayDeque<String>();
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
		 
		 // remove first and remove last
		 System.out.println(dq.remove());
		 System.out.println("Poll first ele : " + dq.pollFirst());
		 System.out.println("poll last ele : " + dq.pollLast());
		 System.out.println("Update ele : " + dq);
		 
	}

}
