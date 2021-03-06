package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		
//		 we have two ways to find identity ⇒ equals and == 
//			→ equals ⇒ used to return true if object content same
//                   - in hashmap we use equals() method for identify duplicate value
//			→  ==    ⇒ used to return true if object reference same
//			         - to make non-duplicate use identity map

		
		// Need of hash map
		HashMap<Integer,String> h = new HashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		h.put(i1, "Ajay");
		h.put(i2, "Ajay");
		System.out.println("HashMap use equal() method  : " + h); // i1.equals(i2) => it's duplicate so replace it's value
	
		// if we use == method
		IdentityHashMap<Integer, String> i = new IdentityHashMap<Integer, String>();
		Integer j1 = new Integer(10);
		Integer j2 = new Integer(10);
		i.put(j1, "Ajay");
		i.put(j2, "Ajay");
		System.out.println("Identity use == method : " + i); // it's treates non-duplicate key
		
		
	
	}

}
