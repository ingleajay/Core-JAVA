package com.inner;

// A non-static class that is created inside a class 
// but outside a method is called member inner class.

public class MemberInnerClass {
	private int a=30;
	private static int c=50;
	final int f = 70;
	
	private int abs1=10;
	
	class Member{
		  private int b = 40;
		  private static int d = 60;
		  final int e = 80;
	      void msg1(){
	    	  System.out.println("Data of outer class in inner class of method : " + a);
	    	  System.out.println("Data of inner class in inner class of method : " + b);
	    	  System.out.println("Data of inner class in inner class of method : " + f);
	      } 
	      static void msg2(){
	    	  System.out.println("Data of outer class in inner class of method : " + c);
	    	  System.out.println("Data of inner class in inner class of method : " + d);
	      } 
	}
	
	abstract class AbstractMember{
		  private int abs2 = 100;
	      void msg1(){
	    	  System.out.println("Data of inner class in abstract inner class of method : " + abs2);
	      } 
	      abstract void msg2(); 
	}
	
	public static void main(String[] args) {
		
		MemberInnerClass m = new MemberInnerClass();
		
		MemberInnerClass.Member mb = m.new Member();
		mb.msg1();
		
		// or
		// m.new Member().msg1();
		Member.msg2();
		System.out.println("Data of inner class in main method: " + mb.b);
		System.out.println("Data of inner class in main method: " + mb.e);
		System.out.println("Data of inner class in main method: " + Member.d);
		System.out.println("Data of outer class in main method: " + m.a);
		System.out.println("Data of outer class in main method: " + c);
		
		AbstractMember ab = m.new AbstractMember() {
			
			@Override
			void msg2() {
		    	  System.out.println("Data of outer class in inner class: " + m.abs1);
			}
		};
		ab.msg1();
		ab.msg2();
	}
}
