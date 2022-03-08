package com.collections;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		/*  It has compareTo() method ⇒ obj1.compareTo( obj2 )
     ⇒  res = -1 ⇒ obj1 before obj2 ⇒ left
     ⇒  res = 0 ⇒ obj1 equal obj2 ⇒ stay there
     ⇒ res = 1 ⇒ obj1 after obj2  ⇒ right
*/
		
		// Comparable has compare To method : 
		TreeSet<String> t = new TreeSet<String>();
		t.add("K");
		t.add("Z");
		t.add("A");
		t.add("A");
		System.out.println("Access ele : " + t);
		
		// object i.e inserted => obj1
		// object i.e already => obj2
		
		System.out.println("Z".compareTo("K")); // positive => right
		System.out.println("A".compareTo("K")); // Negative => left
		System.out.println("A".compareTo("A")); // equal => stay there only
	}

}
