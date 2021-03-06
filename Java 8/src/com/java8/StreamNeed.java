package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNeed implements Comparator{
	
	// if we want to represnt group of objects as a single entity then go for collection 
	// stream introduced in 1.8 version
	// Stream API  is basically perform bulk opeartion and perform the object collection 

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(13);
		a.add(12);
		a.add(0);
		a.add(11);
		System.out.println("Elements in list a : " + a);
		
		// without stream -> need to copy even no from list to new list
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(Integer h : a) {
			if(h%2 == 0)
			 b.add(h);
		}
		System.out.println("Elements in list b : " + b);
		
		// with stream 
		List<Integer> c = a.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Elements in list c : " + c);
		
		// without stream -> need to double list value in copy list
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(Integer k : a) {
			 d.add(k*2);
		}
		System.out.println("Elements in list d : " + d);
		
		// with stream
		List<Integer> e = a.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Elements in list e : " + e);
		
		// without stream -> count no of even number from list
		int count = 0;
		for(Integer f : a) {
			if(f%2==0) {
				count  = count +1;
			}
		}
		System.out.println("Count even no  : " + count);
		
		//with stream 
		long cf = a.stream().filter(i->i%2==0).count();
		System.out.println("Count even no : " + cf);
		
		// use lambda
		Comparator<Integer> l = (u1,u2)->{
			return u2.compareTo(u1);
		};
		
		// without stream -> sort no in array // uses comprable inside
		Collections.sort(a);
		System.out.println("Sorted list Ascending  : " + a);
		
		// with stream // uses comprable
		List<Integer> i = a.stream().sorted().collect(Collectors.toList());
		System.out.println("Sort is ascending : " + i);
		
		// without stream customize descdeing
		// Collections.sort(a, new StreamNeed());
		Collections.sort(a,l);
		System.out.println("Sorted list decscending  : " + a);
		
		// with stream customize descending
		//List<Integer> g = a.stream().sorted((r1,r2)->((r1<r2)?1:((r1>r2)?-1:0))).toList();
		List<Integer> g = a.stream().sorted((r1,r2)->(r2.compareTo(r1))).toList();
		System.out.println("Sorted list descscending  : " + g);
		
		// find min and max value => pass comprator in max()
		Integer max = a.stream().max((w1,w2)->w1.compareTo(w2)).get();
		System.out.println("Max : " + max);
		
		Integer min = a.stream().min((w1,w2)->w1.compareTo(w2)).get();
		System.out.println("min : " + min);
		
		// foreach method
		a.forEach(System.out::println);
		a.forEach((p) -> System.out.println(2*p));
	}

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}
}
