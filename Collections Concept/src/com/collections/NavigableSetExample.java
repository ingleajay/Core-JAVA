package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		
		NavigableSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(900);
		t.add(4000);
		System.out.println("Elemts : " + t);
		
		System.out.println("Ceiling  : " + t.ceiling(1500));
		System.out.println("Higher  : " + t.higher(1500));
		System.out.println("Floor : " + t.floor(1500));
		System.out.println("Lower : " + t.lower(1500));
		//System.out.println("Poll First : " + t.pollFirst());
		//System.out.println("Poll last : " + t.pollLast());
		System.out.println("Descending set" + t.descendingSet());
	}

}
