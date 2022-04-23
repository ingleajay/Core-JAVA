package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		
		//it is interface

		//It used to fill gaps of sortedSort like we can’t tell that before one object what is last element 
		//such things not possible by sortedsort. ( ex. flights timing)
//		1. lower(object o) → before + last ele :  ele < obj
//		2. floor(object o ) → before + last ele  :  ele ≤ obj
//		3. higher(object o) → after + first ele   : ele > obj
//		2. ceiling(object o ) → after + first ele  : ele ≥ obj


		
		NavigableSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(900);
		t.add(4000);
		System.out.println("Elemts : " + t);
		
		// ceiling(object o ) → after + first ele  : ele ≥ obj => 1000>=1500 - N, 2000>=1500
		System.out.println("Ceiling  : " + t.ceiling(1500));
		// higher(object o) → after + first ele   : ele > obj
		System.out.println("Higher  : " + t.higher(1500));
		//  floor(object o ) → before + last ele  :  ele ≤ obj
		System.out.println("Floor : " + t.floor(1500));
		//  lower(object o) → before + last ele :  ele < obj
		System.out.println("Lower : " + t.lower(1500));
		//System.out.println("Poll First : " + t.pollFirst());
		//System.out.println("Poll last : " + t.pollLast());
		System.out.println("Descending set" + t.descendingSet());
	}

}
