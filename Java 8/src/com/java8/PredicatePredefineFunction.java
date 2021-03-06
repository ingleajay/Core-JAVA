package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicatePredefineFunction {

	public static void main(String[] args) {
		
		// Predicate - To take some input and perform some conditional check and  return boolean value
		
		// check number is even or not ? // test() 
		//Predicate<Integer> g = p->p%2==0;
		IntPredicate g = p->p%2==0;
		System.out.println("Check even or not  ? " + g.test(21));
		
		// check even or odd value
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(100);
		a.add(45);
		System.out.println("Elements in array : " + a);
		
		// without predicate
		for(int i = 0 ; i<a.size();i++) {
			if(a.get(i) % 2 == 0) {
				System.out.println("Even Number  : " + a.get(i));
			}
			else {
				System.out.println("Odd Number : " + a.get(i));
			}
		}
		
		// predicate + lambda exp
		System.out.println("It checking every number : ");
		for(int i = 0 ; i<a.size();i++) {
			if(g.test(a.get(i)))
				System.out.println("Even Number : " + a.get(i));
			else
				System.out.println("Odd Number : " + a.get(i));
		};
		
		// use negate() - returns the logical negation of existing predicate.
		boolean odd = g.negate().test(21);
		System.out.println("Check odd or not  ? "  + odd);
		
		// use and() and or()
		
		Predicate<Integer> t = y -> y%2==0;
		Predicate<Integer> m = n -> n>50;
		for(Integer i : a) {
			// Check both condition 
			if(m.and(t).test(i))
			 System.out.println("And : " + i);
			
			// check one of the condition
			if(m.or(t).test(i))
				 System.out.println("Or : " + i);
		};
		
		// predicate pass in function
		// test string length greater 5
		List<String> d = Arrays.asList("Ajay","Vijay","Tea","Manaohar");
		for(String j : d) {
			  boolean k = Testlength(d, (r) -> j.length()>=5);
			  System.out.println(j + " : " + k);
		}
		
		BiPredicate<Integer, String> v = (i,s)-> i%2==0 && s.length()>5;
		System.out.println("Check both at one time  : " +  v.test(21,"Ajayay"));
	}

	private static boolean Testlength(List<String> d,Predicate<List<String>> p) {
		return p.test(d);
	}
}
