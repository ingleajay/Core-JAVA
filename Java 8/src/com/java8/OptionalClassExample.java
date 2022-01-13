package com.java8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		// need of optional class
		// method 1:
		String name = null;
		if(name == null) {
			System.out.println("Please provide string properly");
		}
		else {
			System.out.println("String length : " + name.length());
		}
		
		// method 2:
		try {
		int len = name.length();
		System.out.println("String length : " + len);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// method 3 : 
		 Optional<String> op= Optional.ofNullable(name);
		 
		 // methdod 1 : 
		 System.out.println("Check container is empty : " + op.isEmpty());
		 System.out.println("Check container contains value : " + op.isPresent());
		 System.out.println("Give result : " + op.orElse("Please provide correct string"));
		 name = "ajay";
		 op= Optional.ofNullable(name);
		 System.out.println("Give result : " + op.orElse("Please provide correct string"));
		 
		 Integer lt = op.map((i)->i.length()).get();
		 System.out.println("String length : " + lt);
	}

}
