package com.inner;

// A class i.e., created inside a method, is called local inner class in java
// local class only abstract and final class

public class LocalInnerClass {
	private int a=30;
	private static int c=50;
	final int f = 70;
	
	private int abs1 = 10; 
	
	void display(){ 
		  class Local{  
			  private int b = 40;
			  private static int d = 60;
			  final int e = 80;
		      void msg1(){
		    	  System.out.println("Data of outer class in without static method of inner class: " + a);
		    	  System.out.println("Data of inner class in without static method of inner class: " + b);
		    	  System.out.println("Data of inner class in without static method of inner class: " + f);
		      }  
		      static void msg2(){
		    	  System.out.println("Data of outer class in without static method of inner class: " + c);
		    	  System.out.println("Data of inner class in without static method of inner class: " + d);
		      }  
		  }
		  
		  abstract class AbstractLocal{  
			  private int abs2 = 40;
			  static int d = 10;
		      abstract void absmsg1();  
		      void absmsg2() {
		    	  System.out.println("Data of inner class in without static method of abstract inner class: " + abs2);
		      }
		  } 
		  
		  AbstractLocal al = new AbstractLocal() {
			@Override
			void absmsg1() {
				System.out.println(d + "Data of outer class in without static method of abstract inner class: "+ abs1);
			}
		  };
		  al.absmsg1();
		  al.absmsg2();
		  
		  Local l=new Local();  
		  l.msg1();  
		  Local.msg2();
		  System.out.println("Data of inner class of without static method in outer class: " + l.b);
		  System.out.println("Data of inner class of without static method in outer class: " + l.e);
		  System.out.println("Data of inner class of without static method in outer class: " + l.e);

	}  
	
	static void display2() {
		class StaticLocal{ 
			  private int b = 40;
			  private static int d = 60;
			  final int e = 80;
		      void msg1(){
		    	  System.out.println("Data of inner class of with static method in inner class: " + b);
		      }  
		      static void msg2(){
		    	  System.out.println("Data of outer class of with static method in inner class: " + c);
		    	  System.out.println("Data of inner class of with static method in inner class: " + d);
		      } 
		}
		  StaticLocal l=new StaticLocal();  
		  l.msg1();  
		  StaticLocal.msg2();
		  System.out.println("Data of inner class in outer class: " + l.b);
		  System.out.println("Data of inner class in outer class: " + l.e);
		  System.out.println("Data of inner class in outer class: " + l.e);
	}

	public static void main(String[] args) {
		 LocalInnerClass li = new LocalInnerClass();
		 li.display();
		 display2();
	}
}
