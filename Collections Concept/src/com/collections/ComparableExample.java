package com.collections;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
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
