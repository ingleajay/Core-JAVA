package com.inner;

// A static class is a class that is created inside a class, is called a static nested class in Java.
// It cannot access non-static data members and methods.
public class StaticNestedClass {
	
	 static int data=30;  
	 int a = 10;
	static class StaticInner{  
	   static String name = "Ajay"; 
	   private int b = 90;
	   void msg1(){
		   System.out.println("Data of outer class in static class: " + data );
	   }  
	   static void msg2(){System.out.println("Data of inner class in static class: " + name);} 
	 }  
	 

	public static void main(String[] args) {
		
		StaticNestedClass.StaticInner s = new StaticNestedClass.StaticInner();
		s.msg1();
		StaticInner.msg2();
		System.out.println("Data of outer class in main method: " + new StaticNestedClass().a);

	}

}
