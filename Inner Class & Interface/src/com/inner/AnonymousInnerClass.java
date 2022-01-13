package com.inner;

// A class that has no name is known as an anonymous inner class in Java. 
// It should be used if you have to override a method of class or interface.

abstract class Person{  
	  abstract void eat();  
}  

interface Eatable{  
	 void eat();  
}  

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Person is eating a mango by abstract");
			}
		};
		p.eat();
		
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Person is eating a mango by interface");
			}
		};
		e.eat();
	}
}
