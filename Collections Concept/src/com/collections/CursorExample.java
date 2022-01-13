package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(2);
		v.addElement(10);
		v.add(87);
		System.out.println("Elements in vector  :" + v);
		
		for(Integer e : v) {
			System.out.println("By for each :" + e);
		}
		
		// Enumeration : -> only read access
		Enumeration<Integer> eu = v.elements();
		while(eu.hasMoreElements()) {
			Integer res = eu.nextElement();
			System.out.println("By enumeration : " + res);
		}
		
		// Iterator => read and remove
		Iterator<Integer> i = v.iterator();
		while(i.hasNext()) {
			int no = i.next();
			if(no%2 ==0) {
				System.out.println("Even no : " + no);
			}
			else {
				i.remove();
			}
			System.out.println("By Iterator : " + v);
		}
		
		// ListIteartor -> next elem and prev ele access and remove and set and add
		LinkedList<String> l = new LinkedList<String>();
		l.add("Ajay");
		l.add("Vijay");
		l.add("Sonali");
		System.out.println("Actual Data : " + l);
		ListIterator<String> li = l.listIterator();
		while(li.hasNext()) {
			String k = li.next();
			if(k.equals("Ajay")) {
				li.add("Satshil");
			}
			else if(k.equals("Vijay")) {
				li.remove();
			}
			else if(k.equals("Sonali")) {
				li.set("Shree");
			}
			
		}
		System.out.println("Process Data :" + l);
		if(li.hasPrevious()) {
			System.out.println("Give previous data index : " + li.previousIndex());
		}
		li.remove();
		System.out.println("Tell previous data availbe  : " + li.hasPrevious());
	}
}
